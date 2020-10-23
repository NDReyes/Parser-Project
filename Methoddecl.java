public class Methoddecl implements Token
{
  Fieldandmethod fieldandmethod;
  String id;
  Argdecls argdecls;
  Fielddecls fielddecls;
  Stmts stmts;
  Optionalsemi semi;
  String voidString;
  int state;

  public Methoddecl(Fieldandmethod inputfm, Argdecls args, Fielddecls inputDecls, Stmts s, Optionalsemi semiinput)
  {
    fieldandmethod = inputfm;
    argdecls = args;
    fielddecls = inputDecls;
    stmts = s;
    semi = semiinput;
    state = 0;
  }

  public Methoddecl(String inpVoid, String inpId, Argdecls argInp, Fielddecls inputDecls, Stmts s, Optionalsemi inpsemi)
  {
    voidString = inpVoid;
    id = inpId;
    argdecls = argInp;
    fielddecls = inputDecls;
    stmts = s;
    semi = inpsemi;
    state = 1;
  }


  public String toString(int t)
  {
    if (state == 0)
    {
      return fieldandmethod.toString(t) + " ( " +
       argdecls.toString(t) + " ) \n\t{ " + fielddecls.toString(t) +
       stmts.toString(t) + " \n\t}"
        + semi.toString(t) + "\n";
    }
    else
    {
        return "void" + " " + id + " ( " +
         argdecls.toString(t) + " ) \n\t{ " + fielddecls.toString(t) +
         stmts.toString(t) + " \n\t}"
          + semi.toString(t) + "\n";
    }
  }
}
