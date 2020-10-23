public class Incordec implements Token
{
  String inputString;

  public Incordec(String input)
  {
    inputString = input;
  }

  public String toString(int t)
  {
    return inputString;
  }

}
