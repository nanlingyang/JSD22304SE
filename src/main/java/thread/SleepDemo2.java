package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("娜美"){
            public void run(){
                System.out.println(getName()+": 刚美容完，睡一会儿吧...");
                try {
                    Thread.sleep(1000000000);
                } catch (InterruptedException e) {
                    System.out.println(getName()+": 醒了!");
                    System.out.println(getName()+": 干嘛呢,干嘛呢,干嘛呢,都破相了!");
                }
            }
        };

        Thread hua = new Thread("罗宾"){
            public void run(){
                System.out.println(getName()+": 大锤80!小锤40!开始砸墙!");
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + ":80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("咣当!");
                System.out.println(getName()+": 大哥!搞定!");
                lin.interrupt();
            }
        };
        lin.start();
        hua.start();
    }
}
