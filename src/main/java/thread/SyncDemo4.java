package thread;

import java.net.Socket;

public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(foo::methodA);
        Thread t2 = new Thread(foo::methodB);
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void methodA(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行方法A...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行A方法完毕");
    }

    public synchronized void methodB(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行方法B...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行B方法完毕");
    }
}
