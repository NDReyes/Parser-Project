public class Args implements Token
{
  Expr argsExpr;
  Args args;
  int state;

  public Args(Expr exprInput, Args argsInput)
  {
    argsExpr = exprInput;
    args = argsInput;
    state = 0;
  }

  public Args(Expr exprInput)
  {
    argsExpr = exprInput;
    state = 1;
  }

  public String toString(int t)
  {
    if (state == 0)
    {
      return argsExpr.toString(t) + " , " + args.toString(t);
    }
    else
      return argsExpr.toString(t);
  }


}
