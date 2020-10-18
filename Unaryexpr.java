public class Unaryexpr implements Token
{
  String operand;
  Expr unExpr;

  public Unaryexpr(String opInput, Expr unInput)
  {
    operand = opInput;
    unExpr = unInput;
  }

  public String toString(int t)
  {
    return operand + unExpr.toString(t);
  }


}
