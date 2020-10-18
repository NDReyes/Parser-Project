public class Fielddecls implements Token
{
  Fielddecl decl;
  Fielddecls decls;
  boolean empty;

  public Fielddecls(Fielddecl a, Fielddecls b)
  {
    decl = a;
    decls = b;
    empty = false;
  }

  public Fielddecls()
  {
    empty = true;
  }

  public String toString(int t)
  {
    if(!empty)
      return decl.toString(t) + decls.toString(t);
    else
      return "";

  }

}
