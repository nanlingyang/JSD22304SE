package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前目录下的test.txt文件删除
        //相对路径中"./"是可以忽略不写的，默认就是从"./"开始
        File file = new File("test.txt");//等价于"./test.txt"
        /*
            boolean delete()
            当且仅当File表示的文件或目录被成功删除返回true
         */
        boolean delete = file.delete();
        System.out.println("删除"+(delete?"成功":"失败"));


    }
}
