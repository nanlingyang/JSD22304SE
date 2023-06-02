package string;
/**
 * 字符串是不变对象，修改字符串内容会产生新对象
 * 当遇到频繁拼接字符串时，会产生性能问题
 */
public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i <10000000 ; i++) {
            str.append("a");
        }
        System.out.println("拼接完毕");
    }
}
