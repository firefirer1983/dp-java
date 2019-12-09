JFLAGS = -g -d .
JC = javac
JVM= java 
FILE=

PACKAGE=`echo $(target) | tr A-Z a-z`

.PHONY: clean run default
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

singleton_src = \
        singleton/Singleton.java \
        singleton/SingleTiles.java \
        singleton/SingletonThreadSafe.java \
        singleton/TaskGetTile.java \
        singleton/TestSingletonThreadSafe.java


builder_src = \
        builder/RobotPlan.java \
        builder/Robot.java \
        builder/RobotBuilder.java \
        builder/IronManBuilder.java \
        builder/TestBuilder.java


abstractfactory_src = abstractfactory/Button.java \
                      abstractfactory/CheckBox.java \
                      abstractfactory/IOSButton.java \
                      abstractfactory/IOSCheckBox.java \
                      abstractfactory/WindowsButton.java \
                      abstractfactory/WindowsCheckBox.java \
                      abstractfactory/UIFactory.java \
                      abstractfactory/WindowsUIFactory.java \
                      abstractfactory/IOSUIFactory.java \
                      abstractfactory/AbstractFactory.java


factorymethod_src = factorymethod/EnemyShip.java \
                    factorymethod/RockShip.java \
                    factorymethod/Ufo.java \
                    factorymethod/ShipFactory.java \
                    factorymethod/FactoryMethod.java

builder: $(builder_src:.java=.class)

singleton: $(singleton_src:.java=.class)

abstractfactory: $(abstractfactory_src:.java=.class)

factorymethod: $(factorymethod_src:.java=.class)

run:
	@$(JVM) com/dp/$(PACKAGE)/$(target)


clean:
	@find . -name *.class| xargs rm -f

