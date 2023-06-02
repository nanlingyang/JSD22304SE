package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        Point p = new Point(1,2);
        c.add(p);
        System.out.println(p);
        System.out.println(c);

        p.setX(2);
        System.out.println(p);
        System.out.println(c);
    }
}
