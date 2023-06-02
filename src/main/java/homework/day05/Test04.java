package homework.day05;

import java.io.File;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入关键字:");
		String key = s.nextLine();
		//定位当前目录
		File dir = new File(".");
		//判断是否为目录
		if(dir.isDirectory()) {
			//获取该目录下所有子项
			File files[] = dir.listFiles();
			for(int i=0;i<files.length;i++) {
				//获取每一个子项的名字
				String fileName = files[i].getName();
				//判断名字中是否包含key的内容
				if(fileName.contains(key)) {
					//包含就输出这个名字
					System.out.println(fileName);
				}
			}
		}
    }
}
