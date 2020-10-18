public class Optionalargs implements Token
{
  Args args;
  int state;

  public Optionalargs(Args argsInput)
  {
    args = argsInput;
    state = 0;
  }

  public Optionalargs()
  {
    state = 1;
  }

  public String toString(int t)
  {
    if (state == 0)
    {
      return args.toString(t);
    }
    else
      return "";
  }


}
