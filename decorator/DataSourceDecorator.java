package decorator;


class DataSourceDecorator implements DataSource {
    protected DataSource source;

    public DataSourceDecorator(DataSource source) {
        this.source = source;
    }

    public String readData() {
        return source.readData();
    }

    public void writeData(String buf) {
        source.writeData(buf);
    }
}