package io;

import java.io.*;

public class CopyDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./image_cp3.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d;
        long start = System.currentTimeMillis();
        while((d=bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时"+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}
