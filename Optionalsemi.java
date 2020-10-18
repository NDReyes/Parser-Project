class Optionalsemi
{
  boolean exists;

  public Optionalsemi(String item)
  {
    if (item == "")
      exists = false;
    else if (item == ";")
      exists = true;
  }

  public Optionalsemi()
  {
    exists = false;
  }

  public String toString(int t)
  {
    if(!exists)
      return "";
    else
      return ";";
  }



}
