package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("你谁啊");
            }
        });

      /*  Runnable r2 = new Runnable() {
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("开门");
                }
            }
        };*/

        Thread t2 = new Thread(()->{
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("开门");
                }
            });

        t1.start();
        t2.start();
    }
}
