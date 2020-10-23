public class Fielddecl implements Token
{
  String fieldString;
  Optionalexpr optionalexpr;
  Fieldandmethod fieldandmethod;
  int intlit;

  int state;

  public Fielddecl(String inputString, Fieldandmethod inputFieldm, Optionalexpr inputExpr)
  {
    fieldString = inputString;
    optionalexpr = inputExpr;
    fieldandmethod = inputFieldm;
    state = 0;
  }

  public Fielddecl(Fieldandmethod inputFieldm, int inputInt)
  {
    fieldandmethod = inputFieldm;
    intlit = inputInt;
    state = 1;
  }
  public String toString(int t)
  {
    if(state == 0)
    {
      return fieldString + " " + optionalexpr.toString(t) + " " + fieldandmethod.toString(t) + ";\n";
    }
    else
      return fieldandmethod.toString(t) + "[" + intlit + "];\n";
  }


}
