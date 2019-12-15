package decorator;

class Decorator {
    public static void main(String[] args) {
        DataSource src = new CompressDecorator(new CodecDecorator(new FileDataSource("tmp.txt")));
        System.out.println(src.readData());
        src.writeData(src.readData() + "new data");
    }
}