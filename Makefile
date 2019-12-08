JFLAGS = -g -d .
JC = javac
JVM= java 
FILE=

PACKAGE=`echo $(target) | tr A-Z a-z`

.PHONY: clean run default
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

singletons = \
        Singleton.java \
        SingleTiles.java \
        SingletonThreadSafe.java \
        TaskGetTile.java \
        TestSingletonThreadSafe.java

singleton: $(singletons:.java=.class)

run:
	@$(JVM) com/dp/$(PACKAGE)/$(target)


clean:
	@find . -name *.class| xargs rm -f

