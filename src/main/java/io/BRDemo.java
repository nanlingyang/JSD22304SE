package io;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "./src/main/java/io/BRDemo.java"
        );
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
//        String line = br.readLine();
//        System.out.println(line);
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();

    }
}
