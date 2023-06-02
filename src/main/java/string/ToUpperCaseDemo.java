package string;

/**
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 *
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱java";
        String upper= str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);

//验证码验证的应用:
        String img = "2Y5jZa";//生成的验证码
        String input = "2y5jza";//用户输入的验证码
       // boolean match = img.equals(input);//直接匹配会因为大小写失败
        img = img.toLowerCase();//将生成的验证码转换为全小写(全大写)
        input = input.toLowerCase();//将用户输入的也转换为全小写(全大写)
       // boolean match = img.equals(input);//匹配会成功，达到忽略大小写目的
        boolean match = img.equalsIgnoreCase(input);
        //性能:三目>switch>if
        System.out.println("输入"+(match?"正确":"错误"));




    }
}
