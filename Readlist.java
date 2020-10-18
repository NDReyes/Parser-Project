public class Readlist implements Token
{

  Name listName;
  Readlist readList;
  int state;

  public Readlist(Name inputName, Readlist inputList)
  {
    listName = inputName;
    readList = inputList;
    state = 0;
  }

  public Readlist(Name inputName)
  {
    listName = inputName;
    state = 1;
  }

  public String toString(int t)
  {
    if(state == 0)
      return listName.toString(t) + " , " + readList.toString(t);
    else
      return listName.toString(t);
  }

}
