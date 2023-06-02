package homework.day08;

public class ThreadDemo2 {
    public static void main(String[] args) {

    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("你是谁啊?");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("开门!查水表的!");
        }
    }
}