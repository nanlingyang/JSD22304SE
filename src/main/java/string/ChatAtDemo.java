package string;
/**
 * char charAt(int index)
 * 返回当前字符串中指定下标处的字符
 * 注意:下标不可以为负数，也不可以>=字符串的length，否则会和数组下标一样
 * 出现字符串下标越界异常
 */
public class ChatAtDemo {
    public static void main(String[] args) {
        String line = "hgieujfynfkhbnod";
        char c = line.charAt(9);
        System.out.println(c);

        //System.out.println(line.charAt(9));

        //System.out.println(line.charAt(12));

        String str = "上海自来水水来自海上";

        for (int i = 0; i < str.length()/2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length()-1-i);
            if(c1!=c2){
                System.out.println("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}
