package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.png");
        FileOutputStream fos = new FileOutputStream("./image_cp2.png");
        /*
            InputStream定义了块读方法
            int read(byte[] data)
            一次性读取给定字节数组data总长度的字节量并存入到该数组中。
            返回值表达实际读取到了多少字节。如果返回值为-1表达流读取到末尾了

            原文件内容:
            11001100 01010101 10101010 00111100 11001111 00110011 11101100
            --------------------------------------------------------------

            byte[] data = new byte[3];//长度为3的字节数组
            data:{00000000,00000000,00000000}
            int len=0;

            第一次调用:
            len = fis.read(data);//因为data长度为3，因此一次性读取3字节并存入该数组
            原文件内容:
            11001100 01010101 10101010 00111100 11001111 00110011 11101100
            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
            连续读取3个字节
            data:{11001100,01010101,10101010}读取后数组内容就是读取到的内容
            len:3 len接收的返回值为整数，表示本次实际读取到了3个字节

            -----------------------------------------------------------------
            第二次调用:
            len = fis.read(data);//因为data长度为3，因此一次性读取3字节并存入该数组
            原文件内容:
            11001100 01010101 10101010 00111100 11001111 00110011 11101100
                                       ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
            连续读取3个字节
            data:{00111100,11001111,00110011}读取后数组内容就是读取到的内容
            len:3   len接收的返回值为整数，表示本次实际读取到了3个字节

            ----------------------------------------------------------------
            第三次调用:
            len = fis.read(data);//因为data长度为3，因此一次性读取3字节并存入该数组
            原文件内容:
            11001100 01010101 10101010 00111100 11001111 00110011 11101100
                                                                  ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                  应当读取3个，实际读取到1个
            连续读取3个字节
            data:{11101100,11001111,00110011}
                  本次读取  |--上次的旧数据---|

            len:1   len接收的返回值为整数，表示本次实际读取到了1个字节

            -----------------------------------------------------------------
            第四次调用:
            len = fis.read(data);//因为data长度为3，因此一次性读取3字节并存入该数组
            原文件内容:
            11001100 01010101 10101010 00111100 11001111 00110011 11101100
                                                                           ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                           本次没有数据可读(EOF)
            data:{11101100,11001111,00110011}
                  |------上次的旧数据--------|
            len:-1   已经是文件末尾了
         */
        byte[] date = new byte[1024*10];
        int len = 0;
        long start = System.currentTimeMillis();
        while((len=fis.read(date))!=-1){
            fos.write(date,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕耗时:"+(end-start)+"ms");
        fis.close();;
        fos.close();

    }
}
