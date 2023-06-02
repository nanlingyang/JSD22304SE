package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("./note.txt",true);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名!");
        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
                byte[] date = line.getBytes(StandardCharsets.UTF_8);
                file.write(date);
        }
        System.out.println("再见");
        file.close();

    }
}
