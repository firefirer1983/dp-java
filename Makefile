JFLAGS = -g -d .
JC = javac
JVM= java 
FILE=

.PHONY: clean run default classes
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        com/dp/Singleton.java


default: classes

classes: $(CLASSES:.java=.class)

run:
	@$(JVM) com/dp/$(target)


clean:
	@find . -name *.class| xargs rm -f

