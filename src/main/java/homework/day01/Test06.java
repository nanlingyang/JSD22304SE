package homework.day01;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //验证码对象存验证码
        String code = "";
        //生成验证码范围
        String line = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //在随机生成随机生成
        Random random = new Random();
        //控制验证码长度
        for (int i = 0; i < 4; i++) {
            //在指定范围随机生成下标
            int index = random.nextInt(line.length());
            //创建对象获取小标所对应的字符
            char c = line.charAt(index);
            //拼接获取到的字符
            code += c;
        }
        //输出拼接后的字符
        System.out.println("验证码为:" + code);
        //插入键盘
        Scanner sca = new Scanner(System.in);
        //用户输入验证码
        System.out.println("请输入验证码:");
        //创建对象存用户输入的验证码
        String input = sca.nextLine();
        //判断验证码是否正确
        for (int i = 0; i < 3; i++) {//控制验证码错误次数
            if (code.equalsIgnoreCase(input)) {//不区分大小写比较
                System.out.println("输入正确!");//正确则输出
                return;//正确则结束循环
            } else {
                System.out.println("输入错误!,请继续输入...");//错误则输出
                input = sca.nextLine();//错误则继续输入
            }
        }
        System.out.println("验证失败,请24小时候再验证,如有疑问,请联系客服微信928701244 !");

    }
}


