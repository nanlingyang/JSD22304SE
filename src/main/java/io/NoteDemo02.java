package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
/*        FileOutputStream fos = new FileOutputStream("note2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);

 */

        PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("note2.txt",true),StandardCharsets.UTF_8
                        )
                )
        );
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名!");
        while(true){
            String line = scan.nextLine();
            if("exit".equalsIgnoreCase(line)){
                break;
            }
            pw.println(line);
            pw.flush();
        }
        System.out.println("再见");
        pw.close();
    }
}
