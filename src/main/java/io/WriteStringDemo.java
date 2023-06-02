package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos1.txt");
        String line = "在小小的花园里面,";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("完毕");
        fos.close();
    }
}
