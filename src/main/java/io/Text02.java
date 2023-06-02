package io;

import java.io.*;

public class Text02 {
    public static void main(String[] args) throws Exception {
        File dir = new File("./src/main/java/io/");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles(s -> s.getName().endsWith(".java"));
            for (File sub : subs) {
                System.out.println(sub.getName());

               /* FileInputStream fis = new FileInputStream(sub);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while((line = br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();*/
            }
        }
    }

    public static void PrintFile(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}