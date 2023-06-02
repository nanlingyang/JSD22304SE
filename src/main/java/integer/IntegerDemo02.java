package integer;
/**
 * 包装类中定义了常量表达其表示的基本类型的取值范围
 *
 * 包装类提供了一个静态方法:parseXXX(String str)
 * 将字符串解析为对应的基本类型
 * String->基本类型
 *
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);

        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i+1);
        double d = Double.parseDouble(s1);
        System.out.println(d);

       /*
            包装类将字符串转换为基本类型时，要求该字符串要正确描述基本类型
            可以保存的值，否则会抛出NumberFormatException
                                数字   格式  异常
         */
//        i = Integer.parseInt(s2);
//        System.out.println(i);
        String s2 = "123.123";
        d = Double.parseDouble(s2);
        System.out.println(d);
    }
}
