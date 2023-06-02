package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        String[] array = c.toArray(c.toArray(new String[0]));
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
