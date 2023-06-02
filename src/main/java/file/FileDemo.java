package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println("名字:"+name);
        double len = file.length();
        System.out.println("大小:"+len);

        //是否可读
        boolean cr = file.canRead();
        System.out.println("是否可读:"+cr);

        //可写
        boolean cw = file.canWrite();
        System.out.println("可写:"+cw);
        //是否隐藏
        boolean hidden = file.isHidden();
        System.out.println("是否隐藏:"+hidden);
    }
}
