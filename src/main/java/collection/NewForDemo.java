package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;

public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = {"dfsdsf,srte,ret,er,rt,er,te,rt"};
        for (int i = 0; i < arr.length; i++) {
            String e = arr[i];
            System.out.println(e);
        }
        for(String e:arr){
            System.out.println(e);
        }

        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        for(String e: c){
            String s = (String)e;
            System.out.println(s);
        }
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
