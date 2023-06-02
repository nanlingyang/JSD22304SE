package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲的写缓冲区问题
 */
public class BosFlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "super idol的笑容,都没你的甜";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        //bos.flush();
        System.out.println("写出完毕");
        bos.close();
    }
}
