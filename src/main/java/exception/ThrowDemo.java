package exception;

public class ThrowDemo  {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        try{
            p.setAge(1000);
        }catch (IllegalAgeException e){
            e.printStackTrace();
        }
        System.out.println("此人年龄:"+p.getAge());

    }
}
