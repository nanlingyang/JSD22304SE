package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo01 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("世界第一大剑豪,诺诺亚索隆!");
        pw.println("霸王色霸气");
        System.out.println("写出完毕");
        pw.close();
    }
}
