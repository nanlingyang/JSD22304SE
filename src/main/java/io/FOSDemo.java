package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * JAVA IO
 * IO:Input和Output 即:输入与输出
 *
 * 输入是从外界到程序中的方向,是我们程序用于获取外界信息的过程,是"读"的过程
 * 输出是从程序到外界的方法,是我们程序向外界发送信息的过程,是"写"的过程
 *
 * java.io.InputStream与OutputStream
 * 输入流与输出流   流
 * 这里的流相当于是程序与外界相连的一根管道,用于传输数据.而数据就是字节(2进制)
 *
 * InputStream和OutputStream是两个超类,抽象类.
 * java中实际用于读写数据的流都继承自他们.
 *
 * 文件流
 * java.io.FileInputStream和FileOutputStream
 * 这两个流就继承自InputStream和OutputStream
 * 这两个流是用于连接我们程序和文件之间的管道,读写文件数据(读写硬盘)
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前项目目录下的文件fos.dat中写入数据
        /*
            FileOutputStream是用于连接程序与程序的管道,负责将程序的数据发送到文件中
            常用的构造方法:
            FileOutputStream(File file)
            FileOutputStream(String path)
            注:如果指定的文件不存在,文件流会自动创建它.前提是该文件所在的目录要存在
         */
//        File file = new File("./fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);
        FileOutputStream fos = new FileOutputStream("./fos.dat");
        /*
            OutputStream上定义的方法:
            void write(int d)
            通过当前输出流向目标位置写出1个字节,写出给定int值对应2进制的"低八位"

            fos.write(1);
            1个int值4个字节,32位2进制
            00000000 00000000 00000000 00000001
                                       ^^^^^^^^
                                       实际写出的数据

            fos.dat文件中:
            00000001

            ---------------------------------------------

            fos.write(2);
            1个int值4个字节,32位2进制
            00000000 00000000 00000000 00000010
                                       ^^^^^^^^
                                       实际写出的数据

            fos.dat文件中:
            00000001 00000010
         */
        fos.write(1);
        fos.write(2);
        System.out.println("写出完毕");
        fos.close();//流使用完毕后要关闭
    }
}
