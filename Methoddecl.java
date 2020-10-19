public class Methoddecl implements Token
{
  Returntype returnty;
  Type type;
  String id;
  Argdecls argdecls;
  Fielddecls fielddecls;
  Stmts stmts;
  Optionalsemi semi;
  int state;
  public Methoddecl(Returntype r, String i, Argdecls args, Fielddecls field, Stmts s, Optionalsemi semiinput)
  {
    returnty = r;
    id = i;
    argdecls = args;
    fielddecls = field;
    stmts = s;
    semi = semiinput;
    state = 0;
  }

  public Methoddecl(Type r, String i, Argdecls args, Fielddecls field, Stmts s, Optionalsemi semiinput)
  {
    type = r;
    id = i;
    argdecls = args;
    fielddecls = field;
    stmts = s;
    semi = semiinput;
    state = 1;
  }
  public String toString(int t)
  {
    if (state == 0)
    {
      return returnty.toString(t) + " " + id + " ( " +
           argdecls.toString(t) + " ) \n\t{ " +
           fielddecls.toString(t) + stmts.toString(t) + " \n\t}"
            + semi.toString(t) + "\n";
    }
    else
    return type.toString(t) + " " + id + " ( " +
         argdecls.toString(t) + " ) \n\t{ " +
         fielddecls.toString(t) + stmts.toString(t) + " \n\t}"
          + semi.toString(t) + "\n";
  }
}
