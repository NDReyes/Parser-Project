public class Ifend implements Token
{
  Stmt stmt;
  boolean empty;
  public Ifend(Stmt s)
  {
    stmt = s;
    empty = false;
  }
  public Ifend()
  {
    empty = true;
  }

  public String toString(int t)
  {
    if(empty)
      return "fi";
    else
      return "else \n\t" + stmt.toString(t) + " fi";
  }

}
