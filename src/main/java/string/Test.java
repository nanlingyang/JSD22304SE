package string;

public class Test {
    public static void main(String[] args) {
        String s1 = "www.tedu.cn";
        String s2 = "http://www.tarena.com.cn";
        String name1 = getHostName(s1);
        System.out.println(name1);//应当输出tedu
        String name2 = getHostName(s2);
        System.out.println(name2);//应当输出tarena
    }
    //实现思路:利用indexOf找到地址中第一个和第二个"."的位置，利用substring截取
    public static  String getHostName(String url){
        //找到开始截取的位置(第一个"."之后第一个字符的位置)
        int startIndex = url.indexOf(".")+1;
        //找到截取的结束位置，第二个"."的位置
       int endIndex = url.indexOf(".",startIndex);
       return url.substring(startIndex,endIndex);
    }
}
