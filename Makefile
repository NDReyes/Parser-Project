JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-1.8.2/lib/jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
				$(JAVAC) -cp $(CP) $*.java

FILE=		Lexer.java      parser.java    sym.java \
				parserTest.java \
				Token.java Binaryop.java Expr.java \
				Fielddecl.java Fielddecls.java Memberdecls.java \
				Optionalexpr.java Optionalfinal.java Optionalsemi.java \
				Program.java Type.java

dump: parserD.java $(FILE:java=class)

run: basic.txt test1FI.as test4.as test5.as test2FI.as test3.as

basic.txt: all
		$(JAVA) -cp $(CP) parserTest basic.txt > basic-output.txt
		cat -n basic-output.txt


test1FI.as: all
	$(JAVA) -cp $(CP) parserTest test1FI.as > test1-output.txt
	cat -n test1-output.txt

test4.as: all
	$(JAVA) -cp $(CP) parserTest test4.as > test4-output.txt
	cat -n test4-output.txt

test5.as: all
	$(JAVA) -cp $(CP) parserTest test5.as > test5-output.txt
	cat -n test5-output.txt

test2FI.as: all
	$(JAVA) -cp $(CP) parserTest test2FI.as > test2-output.txt
	cat -n test2-output.txt

test3.as: all
	$(JAVA) -cp $(CP) parserTest test3.as > test3-output.txt
	cat -n test3-output.txt

all: Lexer.java parser.java $(FILE:java=class)

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: grammar.jflex
		$(JFLEX) grammar.jflex

parser.java: tokens.cup
		$(CUP) -interface < tokens.cup

parserD.java: tokens.cup
		$(CUP) -interface -dump < tokens.cup
