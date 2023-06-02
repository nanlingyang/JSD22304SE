package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        list.add(2,"six");
        System.out.println(list);


        System.out.println("被删除的元素是:"+list.remove(3));
        System.out.println(list);
    }
}
