package reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Constructor con = cls.getConstructor();
        //
        // Constructor con = cls.getConstructor(String.class,int.class);
        //Constructor con = cls.getConstructor(new Class[]{String.class,int.class});
        //Object obj = con.newInstance("凌强",22);
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
