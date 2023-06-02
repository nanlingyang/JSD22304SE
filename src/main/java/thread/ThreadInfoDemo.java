package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        String name = main.getName();
        System.out.println("线程的名字:"+name);
        long id = main.getId();
        System.out.println("id:"+id);
        boolean daemon = main.isDaemon();
        System.out.println("是个为守护线程"+daemon);
        boolean isSlive = main.isAlive();
        System.out.println("是否活着:"+ isSlive);
        boolean isInterupted = main.isInterrupted();
        System.out.println("是否被中断:"+isInterupted);
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
    }
}
