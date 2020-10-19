public class Arraydecl implements Token
{
  Type idType;
  String id;
  int intlit;

  public Arraydecl(Type inputType, String inputId, int inputInt)
  {
    idType = inputType;
    id = inputId;
    intlit = inputInt;
  }

  public String toString(int t)
  {
    return "\n" + idType.toString(t) + " " + id + " [ " + intlit + " ];\n";
  }
}
