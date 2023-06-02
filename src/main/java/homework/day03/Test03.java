package homework.day03;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();

        Collection c = new HashSet();
        while(c.size()<10){
            int num = random.nextInt(101);
            c.add(num);
        }
        System.out.println(c);
    }
}
