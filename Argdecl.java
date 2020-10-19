public class Argdecl implements Token
{
  Type type;
  String id;
  int state;

  public Argdecl(Type inputType, String inputId, int inputState)
  {
    type = inputType;
    id = inputId;
    state = inputState;
  }

  //State 0: no brackets
  //State 1: brackets
  public String toString(int t)
  {
    if(state == 0)
      return type.toString(t) + " " + id;
    else
      return type.toString(t) + " " + id + "[]";
  }


}
