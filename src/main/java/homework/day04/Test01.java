package homework.day04;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList();
        Random random = new Random();
        for (int i = 1; i <=20; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o1-o2);
        System.out.println(list);
        List<Integer> list1 = list.subList(6,16);
        Collections.sort(list1, (o1, o2) -> o2-o1);
        System.out.println(list1);
    }


}
