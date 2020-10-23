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
  public Memberdecls(Methoddecls inputMethod)
  {
    methoddecls = inputMethod;
    state = 2;
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
    else if (state == 0)
      return field.toString(t);
    else
      return methoddecls.toString(t);
  }

}
