public class Argdecls implements Token
{
  Argdecllist argdecllist;
  boolean empty;
  public Argdecls()
  {
    empty = true;
  }

  public Argdecls(Argdecllist input)
  {
    argdecllist = input;
    empty = false;
  }

  public String toString(int t)
  {
    if (empty)
      return "";
    else
      return argdecllist.toString(t);

  }
}
