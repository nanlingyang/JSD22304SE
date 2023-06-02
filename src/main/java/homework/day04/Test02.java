package homework.day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 *
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //导入键盘
        Scanner scanner = new Scanner(System.in);
		//提示用户输入
		System.out.println("请输入文件名:");
		//接收用户输入
		String fileName = scanner.nextLine();
		//在根目录中创建
		File file = new File("./"+fileName);
		//加入死循环
		while(true){
		//判断文件存在否
			if(file.exists()){
				//如存在则输出
				System.out.println("该文件已存在，请更换名字");
				//继续输出
				fileName = scanner.nextLine();
			}else{
				//如不存在则输出,则创建新文件
				file.createNewFile();
				//输出
				System.out.println("文件创建完毕!");
				break;
			}
		}

    }
}






