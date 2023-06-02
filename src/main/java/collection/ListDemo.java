package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        System.out.println(list);
        String e = list.get(2);
        System.out.println(e);
       /* for (int i = 0; i <list.size() ; i++) {
            e = list.get(i);
            System.out.println(e);
        }*/
        System.out.println("========================");
        for(String i:list){
            System.out.println(i);
        }

        String old = list.set(4,"tttt");
        System.out.println(list);
        System.out.println(old);



        for(int i=0;i<list.size()/2;i++){
            //获取正数位置的元素
            String s = list.get(i);//one
            //将正数位置的元素设置到对应的倒数位置上
            s = list.set(list.size()-1-i,s);//s为被替换的元素five
            //再将原倒数位置的元素设置到正数位置上
            list.set(i,s);

        }
        System.out.println(list);

//        for(int i=0;i<list.size()/2;i++){
//            list.set(i,list.set(list.size()-1-i,list.get(i)));
//        }

//        for(int i=0;i<list.size()/2;list.set(i,list.set(list.size()-1-i,list.get(i++))));

//        [five, six, three, two, one]

        //Collections是集合的工具类，提供了很多静态方法，操作集合
        Collections.reverse(list);//反转List集合









    }
}
