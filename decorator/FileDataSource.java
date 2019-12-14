package com.dp.decorator;

import java.io.*;


class FileDataSource implements DataSource {
    String fileName;
    public FileDataSource(String fname) {
        fileName = fname;
    }

    public String readData() {
        char[] buf = null;
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)) {
            buf = new char[(int) file.length()];
            reader.read(buf);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buf);
    }

    public void writeData(String buf) {
        File file = new File(fileName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(buf.getBytes(), 0, buf.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
