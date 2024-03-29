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


chainofresp_src = chainofresp/LeaveRequest.java \
                  chainofresp/Leader.java \
                  chainofresp/Director.java \
                  chainofresp/Manger.java \
                  chainofresp/President.java \
                  chainofresp/ChainOfResp.java

mediator_src = mediator/Department.java \
                  mediator/Manager.java \
                  mediator/Development.java \
                  mediator/Financial.java \
                  mediator/Market.java \
                  mediator/Mediator.java


command_src = command/ICommand.java \
              command/Receiver.java \
              command/PateCommand.java \
              command/CopyCommand.java \
              command/Invoker.java \
              command/Command.java

strategy_src = strategy/IStrategy.java \
               strategy/NewFewStrategy.java \
               strategy/NewManyStrategy.java \
               strategy/OldFewStrategy.java \
               strategy/OldManyStrategy.java \
               strategy/Context.java \
               strategy/Strategy.java


templatemethod_src = templatemethod/BankingMethod.java \
                     templatemethod/TemplateMethod.java

observer_src = observer/IObserver.java \
               observer/Subject.java \
               observer/WeChatClient.java \
               observer/WeChatGroup.java \
               observer/Observer.java \

memento_src = memento/EmployeeMemento.java \
              memento/Employee.java \
              memento/CareTaker.java \
              memento/Memento.java \


state_src = com/dp/state/Room.java \
            com/dp/state/RoomState.java \
            com/dp/state/CheckinState.java \
            com/dp/state/BookedState.java \
            com/dp/state/VacancyState.java \
            com/dp/state/State.java


visitor_src = visitor/Visitable.java \
              visitor/Liqor.java \
              visitor/Necessity.java \
              visitor/Tobacco.java \
              visitor/IVisitor.java \
              visitor/TaxVisitor.java \
              visitor/Visitor.java


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

chainofresp: $(chainofresp_src:.java=.class)

mediator: $(mediator_src:.java=.class)

command: $(command_src:.java=.class)

strategy: $(strategy_src:.java=.class)

templatemethod: $(templatemethod_src:.java=.class)

observer: $(observer_src:.java=.class)

memento: $(memento_src:.java=.class)

state: $(state_src:.java=.class)

visitor: $(visitor_src:.java=.class)

run:
	@$(JVM) $(PACKAGE)/$(target)


clean:
	@find . -name *.class| xargs rm -f

