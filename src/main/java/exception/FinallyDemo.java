package exception;

import org.omg.DynamicAny._DynEnumStub;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            //String line = null;
            String line = "abc";
            System.out.println(line.length());
            return;
        }catch (Exception e){
            System.out.println("出错了");
        }finally {
            System.out.println("finally中的代码执行了");
        }
            System.out.println("程序结束了");
    }
}
