package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo02 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){

                File[] subs = dir.listFiles(s->s.getName().endsWith(".txt"));


            for(File sub:subs){
                System.out.println(sub.getName());
            }
        }
    }
}
