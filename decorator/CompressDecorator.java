package com.dp.decorator;

class CompressDecorator extends DataSourceDecorator {
    public CompressDecorator(DataSource src) {
        super(src);
    }

    public String readData() {
        return decompress(source.readData());
    }

    public void writeData(String buf) {
        source.writeData(compress(buf));
    }

    private String compress(String buf) {
        return buf;
    }

    private String decompress(String buf) {
        return buf;
    }

}