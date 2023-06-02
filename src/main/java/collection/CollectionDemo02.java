package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(4,7));
        c.add(new Point(9,9));
        c.add(new Point(1,8));
        c.add(new Point(1,2));
        System.out.println(c);
        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println(contains);

        c.remove(p);
        System.out.println(c);

    }
}
