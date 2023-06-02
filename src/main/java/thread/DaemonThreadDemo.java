package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose"){
            public void run(){
                for (int i = 0; i <5; i++) {
                    System.out.println(getName()+":let me go,let me go,let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName()+":aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println("pia!");
            }
        };

        Thread jack = new Thread("jack"){
            public void run(){
                while (true){
                    System.out.println(getName()+":you jump i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        jack.setDaemon(true);
        jack.start();
        rose.start();
        while (true);
    }
}
