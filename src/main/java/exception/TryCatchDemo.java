package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            //String line = "";
            String line= "a";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
        }catch(NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针或字符串下标越界,在这里解决了!");
        }catch (Exception e){
            System.out.println("发现一个木马病毒!");
        }
        System.out.println("程序保护启动!");
    }
}
