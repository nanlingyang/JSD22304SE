package string;

import java.util.SortedMap;

public class IndexOfDemo {
    public static void main(String[] args) {
        String line = "thinking in java";
        int index = line.indexOf("i");
        System.out.println(index);

        index = line.indexOf("i",2);
        System.out.println(index);

        index = line.lastIndexOf("j");
        System.out.println(index);

        index = line.lastIndexOf("IN");
        System.out.println(index);
    }
}
