public class Fielddecla implements Token
{

  Optionalfinal opfinal;
  Type idtype;
  String idi;
  Optionalexpr opexpr;
  int intlit;
  String finalToken;
  Fielddeclb fielddeclb;
  int state;


  public Fielddecla(Optionalfinal f, Type inputtype, String i, Optionalexpr e)
  {
    opfinal = f;
    idtype = inputtype;
    idi = i;
    opexpr = e;
    state = 0;
  }

  //No final key token
  public Fielddecla(Type inputtype, String i, Optionalexpr e)
  {
    finalToken = "";
    idtype = inputtype;
    idi = i;
    opexpr = e;
    state = 1;
  }

  //Final keytoken
  public Fielddecla(String finalInput, Type inputtype, String i, Optionalexpr e)
  {
    finalToken = "final";
    idtype = inputtype;
    idi = i;
    opexpr = e;
    state = 2;
  }

  public Fielddecla(String finalInput, Fielddeclb fieldInput)
  {
    finalToken = "final";
    fielddeclb = fieldInput;
    state = 3;
  }

  public String toString(int t)
  {
    if(state == 0)
    {
      return "\n" + opfinal.toString(t) + " " +
            idtype.toString(t) + " " + idi + " " + opexpr.toString(t) + ";\n" ;
    }
    else if (state == 3)
    {
      return "\n " + finalToken + fielddeclb.toString(t);
    }
    else
        return "\n " + finalToken + idtype.toString(t) + " " + idi + " " + opexpr.toString(t) + ";\n" ;

  }


}
