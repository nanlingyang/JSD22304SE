package string;

/**
 * java.lang.StringBuilder
 * 专门用来修改字符串内容的工具类
 *  * 其提供了对字符串内容编辑的:增删改插的主要功能
 *  *
 *  * StringBuilder内部维护一个可变的char数组，所以修改内容不会创建新的String对象
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";

        //默认的无参构造器创建时内部表示空字符串:""
//        StringBuilder builder = new StringBuilder();

        //该构造器可以基于一个给定的字符串进行编辑
        StringBuilder builder = new StringBuilder(str);

        /*
            增:
            append()方法，用来将给定内容添加到字符串末尾
            "好好学习java"
                 V
            "好好学习java,为了找个好工作!"
         */
        builder.append(",为了找个好工作!");

        String line = builder.toString();
        System.out.println(line);

        /*
            改:
            replace()
            将当前字符串中指定范围内的内容替换为新内容
            "好好学习java,为了找个好工作!"
                        V
            "好好学习java,就是为了改变世界!"
         */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder.toString());

         /*
            删:
            delete()
            将当前字符串中指定范围内的字符串删除

            "好好学习java,就是为了改变世界!"
                        V
            ",就是为了改变世界!"
         */
        builder.delete(0,8);
        System.out.println(builder);//不加toString默认也是输出toString返回值

        /*
            插:
            insert()
            将给定内容插入到当前字符串中的指定位置
            ",就是为了改变世界!"
                    V
            "活着,就是为了改变世界!"
         */
        builder.insert(0,"活着");
        System.out.println(builder);

        //      反转
        builder.reverse();
        System.out.println(builder);


    }
}
