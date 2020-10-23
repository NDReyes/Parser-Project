public class Argdecl implements Token
{
  Fieldandmethod fieldandmethod;
  int state;

  public Argdecl(Fieldandmethod input, int inputState)
  {
    fieldandmethod = input;
    state = inputState;
  }

  //State 0: no brackets
  //State 1: brackets
  public String toString(int t)
  {
    if(state == 0)
      return fieldandmethod.toString(t);
    else
      return fieldandmethod.toString(t) + "[]";
  }


}
