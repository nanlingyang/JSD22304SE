package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;

/**
 * 集合之间的操作
 */
public class CollectionDemo04 {
    public static void main(String[] args) {
        //Collection c1 = new ArrayList();
           Collection c1 = new HashSet();





        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);
        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);

        c1.addAll(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        Collection c3 = new ArrayList();
        c3.add("java");
        c3.add("aroid");
        System.out.println("c3:"+c3);

        boolean containsAll = c1.containsAll(c3);
        System.out.println("c1是否包含c3的所有元素:"+containsAll);
        c1.retainAll(c3);
        System.out.println("c1:"+c1);
        /*
        差集操作(删除交集部分)
        removeAll可以删除当前集合中与给定集合的共有元素
         */


    }
}
