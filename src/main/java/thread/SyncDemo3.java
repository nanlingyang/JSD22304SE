package thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1 = new Boo();
        Boo b2 = new Boo();
        Thread t1 = new Thread(){
            public void run(){
                b1.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                b2.dosome();
            }
        };
        t1.start();
        t2.start();
            }
        }

class Boo {
    public static void dosome() {
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在执行dosome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + ":执行dosome方法完毕");
        }
    }
}
