package homework.day01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名!");
        String user = scan.nextLine();
        //boolean match= (user.length() > 0 && user.length() < 20);
        //System.out.println(match);
        //System.out.println("输入"+(match?"对":"错"));
        while (true){
            boolean match = (user.length() > 0 && user.length() < 20);
            if(match){
                System.out.println("正确");
                break;
            }else {
                System.out.println("错误,请继续");
                user = scan.nextLine();
            }
        }



    }



}
