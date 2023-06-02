package reflect;

import java.lang.reflect.Method;

/*

 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");//利用无参构造器实例化
        Object p = cls.newInstance();
        Method method = cls.getMethod("sayHello");//sayHello()
        method.invoke(p);//p.sayHello()
    }
}
