package decorator;


class CodecDecorator extends DataSourceDecorator {
    public CodecDecorator(DataSource src) {
        super(src);
    }

    public String readData() {
        return dec(source.readData());
    }

    public void writeData(String buf) {
        source.writeData(enc(buf));
    }

    private String enc(String buf) {
        return buf;
    }

    private String dec(String buf) {
        return buf;
    }
}