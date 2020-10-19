public class Stmt
{
  Name name;
  String unary;
  Readlist readlist;
  Printlist printlist;
  Printlinelist printlinelist;
  String id;
  Args args;
  String returnString;
  Expr expr;
  Stmts stmts;
  Fielddecls fielddecls;
  Optionalsemi optionalsemi;
  Stmt stmt;
  Ifend ifend;
  int state;

  public Stmt(Name inputName, String inputString)
  {
    name = inputName;
    unary = inputString;
    state = 0;
  }

  public Stmt(Readlist readlistInput)
  {
    readlist = readlistInput;
    state = 1;
  }

  public Stmt(Printlist printlistInput)
  {
    printlist = printlistInput;
    state = 2;
  }

  public Stmt(Printlinelist input)
  {
    printlinelist = input;
    state = 3;
  }

  //id();
  public Stmt(String idInput)
  {
    id = idInput;
    state = 4;
  }

  //id(args);
  public Stmt(String idInput, Args argsInput)
  {
    id = idInput;
    args = argsInput;
    state = 5;
  }

  // return;
  public Stmt(String inputString, String semi)
  {
    returnString = "return";
    state = 6;

  }

  // return expr;
  public Stmt(String inputString, Expr e)
  {
    returnString = "return";
    expr = e;
    state = 7;
  }

  //name=expr;
  public Stmt(Name inputName, Expr e)
  {
    name = inputName;
    expr = e;
    state = 8;
  }

  //{ Fielddecls Stmts } Optionalsemi
  public Stmt(Fielddecls inputField, Stmts inputStmts, Optionalsemi semi)
  {
    fielddecls = inputField;
    stmts = inputStmts;
    optionalsemi = semi;
    state = 9;
  }

  //while(expr)stmt)
  public Stmt(Expr e, Stmt s)
  {
    expr = e;
    stmt = s;
    state = 10;
  }

  public Stmt(Expr e, Stmt s, Ifend ie)
  {
    expr = e;
    stmt = s;
    ifend = ie;
    state = 11;
  }

  public String toString(int t)
  {
    if(state == 0)
      return "\n" + name.toString(t) + unary + ";\n";
    else if(state == 1)
      return "\nread ( " + readlist.toString(t) + " );\n";
    else if ( state == 2)
      return "\nprint ( " + printlist.toString(t) + " );\n";
    else if (state == 3)
      return "\nprintline ( " + printlinelist.toString(t) + " );\n";
    else if (state == 4)
      return "\n" + id + "();\n";
    else if (state == 5)
      return "\n" + id + "( " + args.toString(t) + " );\n";
    else if (state == 6)
      return "\nreturn ;\n";
    else if (state == 7)
      return "\nreturn " + expr.toString(t) + ";\n";
    else if (state == 8)
      return "\n"+ name.toString(t) + " = " + expr.toString(t) + " ;\n";
    else if (state == 9)
      return "\n { " + fielddecls.toString(t) + stmts.toString(t) + " }" +
             optionalsemi.toString(t);
    else if (state == 10)
      return "\n while ( " + expr.toString(t) + " ) " + stmt.toString(t);
    else
      return "\n if( " + expr.toString(t) + " ) " + stmts.toString(t) + ifend.toString(t);
  }


}
