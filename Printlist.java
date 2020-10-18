class Printlist implements Token
{
  Expr printExpr;
  Printlist printlist;
  int state;

  public Printlist(Expr inputExpr, Printlist inputList)
  {
    printExpr = inputExpr;
    printlist = inputList;
    state = 0;
  }

  public Printlist(Expr inputExpr)
  {
    printExpr = inputExpr;
    state = 1;
  }

  public String toString(int t)
  {
    if (state == 0)
      return printExpr.toString(t) + " , " + printlist.toString(t);
    else
      return printExpr.toString(t);
  }

}
