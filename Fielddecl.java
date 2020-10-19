public class Fielddecl implements Token
{

  Optionalfinal opfinal;
  Type idtype;
  String idi;
  Optionalexpr opexpr;
  int intlit;
  Arraydecl arraydecl;
  Fielddecla fielddecla;
  Fielddeclb fielddeclb;
  int state;

  public Fielddecl(Optionalfinal f, Type inputtype, String i, Optionalexpr e)
  {
    opfinal = f;
    idtype = inputtype;
    idi = i;
    opexpr = e;
    state = 0;
  }

  public Fielddecl(Arraydecl inputDecl)
  {
    arraydecl = inputDecl;
    state = 1;
  }

  public Fielddecl(Fielddecla input)
  {
    fielddecla = input;
    state = 2;
  }
  public Fielddecl(Fielddeclb input)
  {
    fielddeclb = input;
    state = 3;
  }
  public Fielddecl()
  {
    state = 4;
  }
  public String toString(int t)
  {
    if (state == 0)
    {
      return "\n" + opfinal.toString(t) + " " +
             idtype.toString(t) + " " + idi + " " + opexpr.toString(t) + ";\n" ;
    }
    else if(state == 1)
      return arraydecl.toString(t);
    else if (state == 2)
      return fielddecla.toString(t);
    else if (state == 3)
      return fielddeclb.toString(t);
    else
      return "";
  }


}
