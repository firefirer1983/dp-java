package decorator;

public interface DataSource {
    String readData();
    void writeData(String buf);
}