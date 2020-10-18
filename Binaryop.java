class Binaryop implements Token
{
  String op;

  public Binaryop(String o)
  {
    op = o;
  }

  public String toString(int t)
  {
    return op;
  }
}

  /*
  public Binaryop(Expr l, String o, Expr r)
  {
    lhs = l;
    op = o;
    rhs = r;
  }


  public Binaryop(String o)
  {
    lhs = null;
    op = o;
    rhs = null;
  }

  public String toString(int t)
  {
    return lhs.toString(t) + " " + op + " " + rhs.toString(t);
  }

  public String toString(int t)
  {
    return op;
  }
}
*/
