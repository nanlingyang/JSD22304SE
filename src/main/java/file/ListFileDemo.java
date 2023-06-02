package file;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        //访问当前目录中的所有子项
        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            for(File sub:subs){
                System.out.println(sub.getName());
            }
        }
    }
}
