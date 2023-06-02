package homework.day05;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
             File dir =new File(".");
    if (dir.isDirectory()) {
       File[] files = dir.listFiles(f -> f.isFile());//用files数组记录dir中文件名
       for (File sub : files) {
          String name = sub.getName();
          int index = name.lastIndexOf(".");
          if (index != -1) {
             String forName = name.substring(0, index);
             String beName = name.substring(index);
             File file = new File(sub.getName());
             FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(forName + "_cp" + beName);
             byte[] data = new byte[(int) file.length()];
             fis.read(data);
             fos.write(data);
             fis.close();
             fos.close();
          }

       }
       System.out.println("复制完毕！");
    }

    }
}
