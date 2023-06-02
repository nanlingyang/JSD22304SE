package homework03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=100 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.subList(40,61).clear();
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
