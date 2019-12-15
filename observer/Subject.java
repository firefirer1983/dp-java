package observer;


public interface Subject {
    void notify(String sender, String msg);
    void register(IObserver member);
}