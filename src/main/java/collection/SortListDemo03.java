package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王可敬");
        list.add("窗机来苏军哦");
        list.add("刘飒很");
        System.out.println(list);
      // Collections.sort(list,(o1, o2) -> o1.length()-o2.length());
       list.sort((o1, o2) -> o1.length()-o2.length());

        System.out.println(list);
    }
}
