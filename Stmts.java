public class Stmts implements Token
{
  boolean empty;
  Stmts stmts;
  Stmt stmt;
  public Stmts(Stmt stmtInput, Stmts stmtsInput)
  {
    stmt = stmtInput;
    stmts = stmtsInput;
  }
  public Stmts()
  {
    empty = true;
  }

  public String toString(int t)
  {
    if (empty)
      return "";
    else
      return stmt.toString(t) + stmts.toString(t);
  }


}
