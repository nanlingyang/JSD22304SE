package homework.day06;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test03 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("testpw.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("你好!我喜欢java!");
            System.out.println("写出完毕!");
            pw.flush();
        } catch (Exception e) {
            System.out.println("出错了!");
        }

    }
}
