package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("./a/b/c/d/e/f");
        dir.mkdirs();
        System.out.println("创建完毕");
    }
}
