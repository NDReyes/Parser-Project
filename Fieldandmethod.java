public class Fieldandmethod implements Token
{
  Type type;
  String id;

  public Fieldandmethod(Type inputType, String inputId)
  {
    type = inputType;
    id = inputId;
  }

  public String toString(int t)
  {
    return type.toString(t) + " " + id;
  }


}
