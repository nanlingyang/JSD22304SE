package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("niu niu niu");
        pw.println("liu liu liu");
        pw.println("he he he");
        System.out.println("写出完毕");
        pw.close();
    }
}
