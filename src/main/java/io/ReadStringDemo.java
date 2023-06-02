package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/io/ReadStringDemo.java");
        FileInputStream fis = new FileInputStream(file);
        //
        byte[] data = new byte[(int)file.length()];
        fis.read(data);

        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();

    }
}
