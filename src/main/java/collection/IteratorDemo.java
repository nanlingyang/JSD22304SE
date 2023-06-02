package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if("#".equals(str)){
                iterator.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);



    }

}
