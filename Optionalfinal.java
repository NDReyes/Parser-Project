class Optionalfinal implements Token
{
  String state;

  public Optionalfinal(String input)
  {
    state = input;
  }

  public Optionalfinal()
  {
    state = "";
  }

  public String toString(int t)
  {
    return state;
  }
}
