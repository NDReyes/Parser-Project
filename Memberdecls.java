class Memberdecls implements Token
{
  Fielddecls field;
  Methoddecls methoddecls;
  int state;
  public Memberdecls(Fielddecls input)
  {
    field = input;
    state = 0;
  }
  public Memberdecls(Fielddecls inputField, Methoddecls inputMethod)
  {
    field = inputField;
    methoddecls = inputMethod;
    state = 1;
  }
  public String toString(int t)
  {
    if(state == 1 )
      return field.toString(t) + methoddecls.toString(t);
    else
      return field.toString(t);
  }

}
