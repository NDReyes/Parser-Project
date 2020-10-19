public class Returntype implements Token
{
  Type type;
  String voidString;
  int state;

  public Returntype(Type input)
  {
    type = input;
    state = 0;
  }
  public Returntype(String input)
  {
    voidString = input;
    state = 1;
  }

  public String toString(int t)
  {
    if(state == 0)
      return type.toString(t);
    else
      return voidString;
  }

}
