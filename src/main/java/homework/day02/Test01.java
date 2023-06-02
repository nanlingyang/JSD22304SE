package homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 *
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//创建对象类型错误
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object i = iterator.next();
			System.out.println(i);
		}
        System.out.println(list);
    }
}
