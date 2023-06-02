package file;

import java.io.File;
/**
 * 获取当前项目目录下所有名字以"."开始的目录
 */
public class Test3 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles(
            f->f.getName().startsWith(".")&&f.isDirectory()
            );
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
