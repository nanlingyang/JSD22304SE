package collection;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        //Collections.sort(list);
        Collections.sort(list, (o1, o2) -> o2-o1);
        System.out.println(list);

//        Collections.shuffle(list);
//        System.out.println(list);

    }
}
