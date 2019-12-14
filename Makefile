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


adapter_src = adapter/RoundPeg.java \
              adapter/RoundHole.java \
              adapter/SquarePeg.java \
              adapter/SquarePegAdapter.java \
              adapter/Adapter.java


bridge_src = bridge/Device.java \
             bridge/RadioDevice.java \
             bridge/TVDevice.java \
             bridge/Remote.java \
             bridge/StupidRemote.java \
             bridge/SmartRemote.java \
             bridge/Bridge.java



decorator_src = decorator/DataSource.java \
                decorator/FileDataSource.java \
                decorator/DataSourceDecorator.java \
                decorator/CodecDecorator.java \
                decorator/CompressDecorator.java \
                decorator/Decorator.java

proxy_src = proxy/Video.java \
            proxy/YoutubeService.java \
            proxy/YoutubeProxy.java \
            proxy/Proxy.java

flyweight_src = flyweight/Coordinate.java \
                flyweight/IChess.java \
                flyweight/Chess.java \
                flyweight/ChessFactory.java \
                flyweight/FlyWeight.java


composite_src = composite/FileComponent.java \
                composite/Directory.java \
                composite/ImageFile.java \
                composite/VideoFile.java \
                composite/Composite.java


builder: $(builder_src:.java=.class)

singleton: $(singleton_src:.java=.class)

abstractfactory: $(abstractfactory_src:.java=.class)

factorymethod: $(factorymethod_src:.java=.class)

adapter: $(adapter_src:.java=.class)

bridge: $(bridge_src:.java=.class)

decorator: $(decorator_src:.java=.class)

proxy: $(proxy_src:.java=.class)

flyweight: $(flyweight_src:.java=.class)


composite: $(composite_src:.java=.class)

run:
	@$(JVM) com/dp/$(PACKAGE)/$(target)


clean:
	@find . -name *.class| xargs rm -f

