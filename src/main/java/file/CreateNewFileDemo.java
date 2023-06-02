package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        file.createNewFile();
        System.out.println("创建完毕!");
        if(file.exists()){
            System.out.println("该文件已存在");
        }else{
            file.createNewFile();
            System.out.println("创建完毕");
        }
    }


}
