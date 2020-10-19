public class Fielddeclb implements Token
{

  Type idtype;
  String idi;
  Optionalexpr opexpr;


  public Fielddeclb(Type inputtype, String i, Optionalexpr e)
  {
    idtype = inputtype;
    idi = i;
    opexpr = e;
  }

  public String toString(int t)
  {

    return idtype.toString(t) + " " + idi + " " + opexpr.toString(t) + ";\n" ;

  }


}
