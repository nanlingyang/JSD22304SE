package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("5");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        System.out.println(c);
        c.add("1");
        //boolean su = c.
        //System.out.println("是否成功存入:"+);
        System.out.println(c);

        int size = c.size();
        System.out.println("集合元素个数:"+size);

        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);

        c.clear();
        System.out.println(c);
        System.out.println("集合的元素个数:"+c.size());
        System.out.println("是否为空:"+c.isEmpty());
    }
}
