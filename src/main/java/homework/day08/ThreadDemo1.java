package homework.day08;

public class ThreadDemo1 {
    public static void mian(String[] args){
                Thread t1 = new MyThread1();
                Thread t2 = new MyThread2();

                t1.start();
                t2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("你是谁啊?");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("开门,查水表的!");
        }
    }
}
