package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();

        //Shop shop = new Shop();
        Thread t1 = new Thread("王克晶"){
          public void run(){shop1.buy();
          }
        };
        Thread t2 = new Thread("范传奇"){
          public void run(){shop2.buy();
          }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public  void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"正在挑衣服...");
            Thread.sleep(5000);
        synchronized (this) {
            System.out.println(t.getName() + ":正在试衣服...");
            Thread.sleep(5000);
        }
            System.out.println(t.getName()+"结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
