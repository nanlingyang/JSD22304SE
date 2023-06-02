package integer;

public class IntegerDemo01 {
    public static void main(String[] args) {
        //基本类型转换成包装类
        int i = 129;
//        Integer i1 = new Integer(i);
//        Integer i2 = new Integer(i);

        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf(i);
        System.out.println(i1==i2);//false
        //包装类java提供时已经重写过equals方法了，用来比较对象内容
        System.out.println(i1.equals(i2));//true
        System.out.println(i2);

        double d = 123.123;
        Double d1 = Double.valueOf(d);
        Double d2 = Double.valueOf(d);
        System.out.println(d1==d2);//是否是同一个对象
        System.out.println(d1.equals(d2));//内容是否相同

        long lon = i1.longValue();
        System.out.println(lon);
        int b = i1.intValue();
        System.out.println(b);
    }
}
