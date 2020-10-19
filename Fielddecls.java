public class Fielddecls implements Token
{
  Fielddecl decl;
  Fielddecls decls;
  int state;

  public Fielddecls(Fielddecl a, Fielddecls b)
  {
    decl = a;
    decls = b;
    state = 0;
  }

  public Fielddecls()
  {
    state = 1;
  }

  public Fielddecls(Fielddecl input)
  {
    decl = input;
    state = 3;
  }
  public String toString(int t)
  {
    if(state == 0)
      return decl.toString(t) + decls.toString(t);
    else if ( state == 3)
      return decl.toString(t);
    else
      return "";

  }

}
