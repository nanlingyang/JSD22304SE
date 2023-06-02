package reflect;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Student");

        Object obj = cls.newInstance();
        System.out.println(obj);

        Constructor cons = cls.getConstructor(new Class[]{String.class,int.class,char.class});
        Object objs = cons.newInstance("凌",18,'男');
        System.out.println(objs);

    }
}
