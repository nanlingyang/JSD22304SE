package homework.day08;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("你是谁啊?");
                }
            }
        };

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("开门,查水表的!");
            }
        });
        t1.start();
        t2.start();
    }
}
