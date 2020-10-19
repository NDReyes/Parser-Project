class Program implements Token
{
  String idi;
  Memberdecls mem;
  public Program(String i, Memberdecls input)
  {
    idi = i;
    mem = input;
  }

  public String toString(int t)
  {
    return "class " + idi + " {\n\t" + mem.toString(t) + " \n}\n";
  }
}
