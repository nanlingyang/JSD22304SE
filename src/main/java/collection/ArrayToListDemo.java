package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);

        list.set(2,"six");
        System.out.println("list:"+list);
        System.out.println("array:"+Arrays.toString(array));

        /*list.add("seven");
        System.out.println("list:"+list);
        System.out.println("array:"+Arrays.toString(array));*/

        /*list.remove(5);
        System.out.println(list);
        System.out.println("array:"+Arrays.toString(array));
*/
        List<String> list1  = new ArrayList<>(list);
        //list1.addAll(list);
        list1.add("seven");
        System.out.println("list1:"+list1);
        List<String> list2 = new ArrayList<>(list1);
        list2.add("wwoeeo");
        System.out.println("list2:"+list2);
    }
}
