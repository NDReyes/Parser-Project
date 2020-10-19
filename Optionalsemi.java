public class Optionalsemi implements Token
{
  String semi;

  public Optionalsemi(String item)
  {
    if (item == ";")
      semi = ";";
    else
      semi = "";
  }

  public Optionalsemi()
  {
    semi = "";
  }

  public String toString(int t)
  {
    return semi;
  }



}
