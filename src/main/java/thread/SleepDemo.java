package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        /*System.out.println("<三刀流.龙极侍>");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<飒~飒~飒~>");*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字!");
        int num = scanner.nextInt();
        for (int i=num;i>=0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("爆炸了!");

    }
}
