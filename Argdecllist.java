public class Argdecllist implements Token
{
  Argdecl argdecl;
  Argdecllist argdecllist;
  int state;

  public Argdecllist(Argdecl inputOne, Argdecllist inputTwo)
  {
    argdecl = inputOne;
    argdecllist = inputTwo;
    state = 0;
  }

  public Argdecllist(Argdecl inputOne)
  {
    argdecl = inputOne;
    state = 1;
  }

  public String toString(int t)
  {
    if(state == 0)
      return argdecl.toString(t) + " , " + argdecllist.toString(t);
    else
      return argdecl.toString(t);
  }


}
