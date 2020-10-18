class Optionalexpr implements Token
{
  Expr e;
  boolean exists;

  public Optionalexpr(Expr input)
  {
    e = input;
    exists = true;
  }

  public Optionalexpr()
  {
    exists = false;
  }

  public String toString(int t)
  {
    if (exists)
      return " = " + e.toString(t);
    else
      return "";
  }


}
