package integer;

public class IntegerDemo {
    public static void main(String[] args) {
         /*
            JDK1.5之后，java推出了一个新特性:自动拆装箱
            我们可以在源代码中直接将基本类型与对应的包装类相互赋值
            Integer in = 123;//基本类型赋值给包装类
            int i = Integer.valueOf(123);//将包装类对象赋值给基本类型

            编译器在编译代码时如果发现上述情况，会自动补充转换代码到字节码文件中
            编译后的class文件中上述代码会被编译器改为:
            Integer in = Integer.valueOf(123);
            上述代码编译器补充了基本类型转换为包装类的代码，这被我们
            称作:自动装箱

            int i = Integer.valueOf(123).intValue();
            上述代码编译器补充了包装类转换为基本类型，该操作称为:自动拆箱
         */
        Integer in =123;
        int i = in;
    }
}
