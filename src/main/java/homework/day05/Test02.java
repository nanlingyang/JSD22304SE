package homework.day05;

import java.io.File;
import java.io.FileFilter;

public class Test02 {
    public static void main(String[] args) {
        //访问当前目录中的所有子项
        File dir = new File(".");
        //判断当前File对象表示的是否为一个实际存在的目录(文件夹)
        if(dir.isDirectory()){
            //返回一个File数组,数组中每个元素(一个File对象)表示该目录中的一个子项
            /*File[] subs = dir.listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return file.getName().contains("s");
                }
            });*/
            File[] subs = dir.listFiles(file->file.getName().contains("s"));
            //遍历目录元素
            for(int i=0;i<subs.length;i++){
                //获取每一个元素的名字
                System.out.println(subs[i].getName());
            }

        }



    }
}
