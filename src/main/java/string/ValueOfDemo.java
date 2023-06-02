package string;

public class ValueOfDemo {
    public static void main(String[] args) {
        int i = 123;
        String s1 = String.valueOf(i);
        System.out.println(s1);

        double d = 123.123;
        String s2 = String.valueOf(d);
        System.out.println(s2);

        String s3 = i+"";
        System.out.println(s3);
    }
}
