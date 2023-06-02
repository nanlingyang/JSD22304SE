package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Person P = new Person();
        System.out.println(P);

        //Class cls = Class.forName("reflect.Person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        Object obj = cls.newInstance();
        System.out.println(obj);
    }
}
