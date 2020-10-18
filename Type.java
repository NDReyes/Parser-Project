class Type implements Token
{
  String typename;

  public Type(String input)
  {
    typename = input;
  }

  public String toString(int t)
  {
    return typename;
  }


}
