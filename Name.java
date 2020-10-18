public class Name implements Token
{
  String id;
  Expr expr;
  int state;

  public Name(String input)
  {
    id = input;
    state = 0;
  }

  public Name(String strinput, Expr exprinput)
  {
    id = strinput;
    expr = exprinput;
    state = 1;
  }

  public String toString(int t)
  {
    if (state == 0)
      return id;
    else
      return id + " [ " + expr.toString(t) + " ] ";
  }

}
