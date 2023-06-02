package homework.day01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.println("请输入一个网址:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int start = line.indexOf(".")+1;
        int end = line.lastIndexOf(".");
        System.out.println(end);
        String name = line.substring(start,end);

        if(name.equals("baidu")) {
            System.out.println("这是百度网站");
            //判断域名是否为tedu
        }else if(name.equals("tedu")) {
            System.out.println("这是达内网站");
        }else {
            System.out.println("这是其他网站");}


    }
}
