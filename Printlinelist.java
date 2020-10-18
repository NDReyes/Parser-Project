class Printlinelist implements Token
{
  Printlist printlist;
  boolean empty;

  public Printlinelist(Printlist inputPrint)
  {
    printlist = inputPrint;
    empty = false;
  }

  public Printlinelist()
  {
    empty = true;
  }
  public String toString(int t)
  {
    if (empty)
      return "";
    else
      return printlist.toString(t);
  }

}
