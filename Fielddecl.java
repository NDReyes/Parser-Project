public class Fielddecl implements Token
{

  Optionalfinal opfinal;
  Type idtype;
  String idi;
  Optionalexpr opexpr;
  int intlit;
  int state;

  public Fielddecl(Optionalfinal f, Type inputtype, String i, Optionalexpr e)
  {
    opfinal = f;
    idtype = inputtype;
    idi = i;
    opexpr = e;
    state = 0;
  }

  public Fielddecl(Type inputtype, String i, int intput)
  {
    idtype = inputtype;
    idi = i;
    intlit = intput;
    state = 1;
  }
  public String toString(int t)
  {
    if (state == 0)
    {
      return "\n" + opfinal.toString(t) + " " +
             idtype.toString(t) + " " + idi + " " + opexpr.toString(t) + ";\n" ;
    }
    else
      return "\n" + idtype.toString(t) + " " + idi + " [ " + intlit + " ];\n";
  }


}
