class Memberdecls implements Token
{
  Fielddecls field;
  public Memberdecls(Fielddecls input)
  {
    field = input;
  }
  public String toString(int t)
  {
    return field.toString(t);
  }

}
