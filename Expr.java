class Expr implements Token
{
  Expr lhs, rhs;
  Expr nextExpr;
  Name exprName;
  Binaryop op;
  String input;
  String idi;
  int intlit;
  char charlit;
  boolean boollit;
  float floatlit;
  Optionalargs args;
  Unaryexpr unExpr;
  Type type;
  int state;

  public Expr(int a)
  {
    intlit = a;
    state = 0;
  }

  public Expr(char b)
  {
    charlit = b;
    state = 1;
  }

  public Expr(boolean c)
  {
    boollit = c;
    state = 2;
  }

  public Expr(float d)
  {
    floatlit = d;
    state = 3;
  }

  public Expr(String i)
  {
    input = i;
    state = 4;
  }

  public Expr(Expr l, Binaryop o, Expr r)
  {
    lhs = l;
    op = o;
    rhs = r;
    state = 5;

  }

  public Expr(Name input)
  {
    exprName = input;
    state = 6;
  }

  //If arguments contain an ID and an optional argument.
  public Expr(String idInput, Optionalargs argsInput)
  {
    idi = idInput;
    args = argsInput;
    state = 7;
  }

  //If arguments contain a unary expression.
  public Expr(Unaryexpr unInput)
  {
    unExpr = unInput;
    state = 8;
  }

  //If arguments contain (expression)
  public Expr(Expr inputExpr)
  {
    nextExpr = inputExpr;
    state = 9;
  }

  // (Type) Expr
  public Expr(Type t, Expr e)
  {
    type = t;
    nextExpr = e;
    state = 10;
  }

  // ( Expr ? Expr : Expr )
  public Expr(Expr one, Expr two, Expr three)
  {
    lhs = one;
    nextExpr = two;
    rhs = three;
    state = 11;
  }

  public String toString(int t)
  {
    if (state == 0)
      return "" + intlit;

    else if (state == 1)
      return "" + charlit;

    else if (state == 2)
      return "" + boollit;

    else if (state == 3)
      return "" + floatlit;

    else if(state == 4)
      return input;

    else if (state == 5)
      return "( " + lhs.toString(t) + op.toString(t) + rhs.toString(t) + " )";
    else if (state == 6)
      return exprName.toString(t);
    else if (state == 7)
      return idi + "( " + args.toString(t) + " )";
    else if (state == 8)
      return "( " + unExpr.toString(t) + " )";
    else if (state == 9)
      return "( " + nextExpr.toString(t) + " )";
    else if (state == 10)
      return "( " + type.toString(t) + " ) " + nextExpr;
    else
      return "( " + lhs.toString(t) + " ? " + nextExpr.toString(t) + " : " +
             rhs.toString(t) + " )" ;
  }


}
