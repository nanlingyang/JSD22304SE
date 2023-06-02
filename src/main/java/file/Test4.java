package file;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个目录的路径");
        String path = scanner.nextLine();
        File dir = new File(path);
        if(dir.isDirectory()){
            System.out.println("请输入要获取的文件后缀");
            String ext= scanner.nextLine();
            File[] subs = dir.listFiles(f->f.getName().endsWith(ext));
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }else {
            System.out.println("不是一个目录,或者该目录不存在");
        }
    }
}
