package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("我是海贼王");
        osw.write("我是大和，女帝，娜美，罗宾");
        System.out.println("写完了");
        osw.close();
    }
}
