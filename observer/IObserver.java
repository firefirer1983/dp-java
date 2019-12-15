package observer;


abstract class IObserver {

    private String name;

    public IObserver(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract void receive(String msg);

    abstract void send(String msg);
}