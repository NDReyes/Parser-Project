class Expr implements Token
{
  Expr lhs, rhs;
  Name exprName;
  Binaryop op;
  String input;
  int intlit;
  char charlit;
  boolean boollit;
  float floatlit;
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
      return lhs.toString(t) + op.toString(t) + rhs.toString(t);
    else
      return exprName.toString(t);
  }


}
