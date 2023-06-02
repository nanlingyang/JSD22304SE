package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/*

 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取String的类对象
       // Class cls = String.class;//该cls对象表示的就是String类的信息
        //Class cls = Map.Entry.class;
       // Class cls = Class.forName("java.util.ArrayList");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String classNmae = scanner.nextLine();
        Class cls = Class.forName(classNmae);

        //获取类对象所表示的类的完全限定名
        String name =cls.getName();
        System.out.println(name);
        //仅获取类名
        name = cls.getSimpleName();
        System.out.println(name);

        //获取包
        Package p = cls.getPackage();//获取包
        String pname = p.getName();//通过包对象可以获取包名
        System.out.println(pname);
        /*

         */
        Method[] methods  =cls.getMethods();
        for(Method method : methods){
            String mname = method.getName();//通过方法对象获取该方法的名字
            System.out.println(mname);
        }
    }
}
