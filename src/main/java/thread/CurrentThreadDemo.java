package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("执行main方法的线程是："+main);
        dosome();
    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程是:"+t);
    }

}