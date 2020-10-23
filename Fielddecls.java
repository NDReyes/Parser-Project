public class Fielddecls implements Token
{
  Fielddecl decl;
  Fielddecls decls;
  Fielddecla fielddecla;
  Fielddeclb fielddeclb;
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

  //Fielddecla Fielddecls
  public Fielddecls(Fielddecla inputa, Fielddecls inputb)
  {
    fielddecla = inputa;
    decls = inputb;
    state = 4;
  }

  //Fielddeclb Fielddecls
  public Fielddecls(Fielddeclb inputa, Fielddecls inputb)
  {
    fielddeclb = inputa;
    decls = inputb;
    state = 5;
  }


  public String toString(int t)
  {
    if(state == 0)
      return decls.toString(t) + " " + decl.toString(t);
    else if ( state == 3)
      return decl.toString(t);
    else
      return "";

  }

}
