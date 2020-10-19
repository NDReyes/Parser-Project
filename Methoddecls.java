class Methoddecls implements Token
{
  Methoddecl methoddecl;
  Methoddecls methoddecls;
  boolean empty;

  public Methoddecls(Methoddecl inputmethod, Methoddecls inputdecls)
  {
    methoddecl = inputmethod;
    methoddecls = inputdecls;
  }

  public Methoddecls()
  {
    empty = true;
  }

  public String toString(int t)
  {
    if(empty)
      return "";
    else
      return methoddecl.toString(t) + methoddecls.toString(t);
  }


}
