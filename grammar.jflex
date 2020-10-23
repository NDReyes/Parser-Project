/** Author: Nestor Reyes ndr170001
  * Date: 9/16/2020
  * Purpose: Includes the grammar of the language. Lexical functions, pattern definitions,
  * and lexical rules.
  */

import java_cup.runtime.*;


%%

/** Lexical Functions */

%cup
%line
%column
%unicode
%class Lexer

/**
  * tokenId - given token id in the argument.
  * yyline - line the token was found (unique to jflex)
  * yycolumn - column the token was found (unique to jflex)
*/

%{

Symbol getSymbol(int tokenId)
{
  return new Symbol(tokenId, yyline, yycolumn);
}

Symbol getSymbol(int tokenId, Object value)
{
  return new Symbol(tokenId, yyline, yycolumn, value);
}

%}

/**  Pattern Definitions */

tab      = \\t
newline  = \\n
slash    = \\
letter   = [A-Za-z]
digit    = [0-9]
id       = {letter}[{letter}|{digit}]*
charlit  = \'.\'|{newline}
intlit   = {digit}+
floatlit = {digit}+\.{digit}+
strlit   = \".*\.*\"
inlinecomment = {slash}{slash}.*\n
whitespace = [ \n\t\r]
blockcomment = "\\*"[^*]~"*\\" | "\\*"\**"*\\"

%%
/** Lexical Rules */

/* Ignoreables */
{whitespace}      { /* Ignore */ }
{blockcomment}    { /* Ignore */ }
{inlinecomment}   { /* Ignore */ }

/* Variable Types */
"int"             { return getSymbol(sym.INT, "int");}
"float"           { return getSymbol(sym.FLOAT, "float");}
"bool"            { return getSymbol(sym.BOOL, "bool");}
"char"            { return getSymbol(sym.CHAR, "char");}

/* Math symbols */
"*"               { return getSymbol(sym.MULT, "*");}
"+"               { return getSymbol(sym.ADD, "+");}
"-"               { return getSymbol(sym.SUBTRACT, "-");}
"/"               { return getSymbol(sym.DIVIDE, "-");}
"++"              { return getSymbol(sym.INCREMENT, "++");}
"--"              { return getSymbol(sym.DECREMENT, "--");}

//Unary stuff

//"+"               { return getSymbol(sym.UNADD, "+");}
//"-"               { return getSymbol(sym.UNSUB, "-");}
/* Comparison Symbols */
"<"               { return getSymbol(sym.LESSTHAN, "<");}
">"               { return getSymbol(sym.GREATERTHAN, ">");}
"<="              { return getSymbol(sym.LESSTHANEQ, "<=");}
">="              { return getSymbol(sym.GREATERTHANEQ, ">=");}
"=="              { return getSymbol(sym.EQ, "==");}
"<>"              { return getSymbol(sym.NOTEQ, "<>");}
"\\"               { return getSymbol(sym.BACKSLASH, "\\");}
"||"               { return getSymbol(sym.OR, "|");}
"&&"              { return getSymbol(sym.AND, "&&");}
"true"            { return getSymbol(sym.TRUE, "true");}
"false"           { return getSymbol(sym.FALSE, "false");}

/* General Symbols */
"class"           { return getSymbol(sym.CLASS, "class");}
"else"            { return getSymbol(sym.ELSE, "else");}
"if"              { return getSymbol(sym.IF, "if");}
"fi"              { return getSymbol(sym.FI, "fi");}
"while"           { return getSymbol(sym.WHILE, "while");}
"return"          { return getSymbol(sym.RETURN, "return");}
"read"            { return getSymbol(sym.READ, "read");}
"print"           { return getSymbol(sym.PRINT, "print");}
"printline"       { return getSymbol(sym.PRINTLINE, "printline");}
"final"           { return getSymbol(sym.FINAL, "final");}
"="               { return getSymbol(sym.ASSMNT, "=");}
":"               { return getSymbol(sym.COLON, ":");}
"("               { return getSymbol(sym.OPENPARAN, "(");}
")"               { return getSymbol(sym.CLOSEDPARAN, ")");}
"["               { return getSymbol(sym.OPENBRACK, "[");}
"]"               { return getSymbol(sym.CLOSEDBRACK, "]");}
"{"               { return getSymbol(sym.OPENCURLY, "{");}
"}"               { return getSymbol(sym.CLOSEDCURLY, "}");}
","               { return getSymbol(sym.COMMA, ",");}
"?"               { return getSymbol(sym.QUEST, "?");}
"~"               { return getSymbol(sym.TILDE, "~");}
";"               { return getSymbol(sym.SEMICOLON, ";");}
"void"            { return getSymbol(sym.VOID, "void");}
{id}              {return getSymbol(sym.ID, yytext());}
{intlit}          {return getSymbol(sym.INTLIT, new Integer(yytext()));}
{floatlit}        {return getSymbol(sym.FLOATLIT, new Float(yytext()));}
{strlit}          {return getSymbol(sym.STRLIT, new String(yytext()));}
{charlit}         {return getSymbol(sym.CHARLIT, new Character(yytext().charAt(1)));}
.                 { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }
