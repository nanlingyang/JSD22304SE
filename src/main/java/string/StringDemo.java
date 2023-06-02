package string;

/**
 * 字符串
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";//与s1使用相同字面量时会重用对象
        System.out.println(s1==s2);//true   s1和s2保存的地址相同
        String s3 = "123abc";//依然会重用s1的对象
        System.out.println(s1==s3);//true   s1和s3地址也相同

        s1 = s1 + "!"; //修改内容会创建新对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);//修改s1不影响其他对象
        System.out.println(s1==s2);//false s1指向新对象，不在与s2用同一个对象

        String s4 = new String("123abc");//new一定产生新对象
        System.out.println("s4:"+s4);
        System.out.println(s2==s4);//false s4没有使用常量池缓存的对象
 /*
            触发了编译器特性:预计算
            预计算:编译器在编译源代码时如果发现一个计算表达式中运算符两侧都是
            直接量(字面量)时则会直接进行计算，并将计算结果替换改计算表达式到
            字节码文件中
            好处:每次JVM运行时就无需再次计算了。

            下面代码JVM运行时看到的是:
            String s5 = "123abc";//因此会重用字符串对象
         */
        String s5 = "123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);

        String s = "123";
        String s6 = s + "abc";
        System.out.println("s6:"+s6);//编译器不会进行预计算
        System.out.println(s2==s6);
    }
}
