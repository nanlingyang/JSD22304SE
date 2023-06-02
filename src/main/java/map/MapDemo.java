package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Integer value = map.put("语文",90);
        System.out.println(value);
        map.put("语文",99);
        map.put("数学",100);
        map.put("英语",120);
        map.put("物理",110);
        map.put("化学",100);
        System.out.println(map);
        value = map.put("英语",77);
        System.out.println("value:"+value);
        System.out.println(map);


        value = map.get("数学");
        System.out.println("数学:"+value);
        value = map.get("体育");
        System.out.println("体育:"+value);

        int size = map.size();
        System.out.println("size"+size);
        boolean ck = map.containsKey("化学");
        boolean cv = map.containsValue(94);
        System.out.println("是否包含key:"+ck);
        System.out.println("是否包含value:"+cv);
        value = map.remove("数学");
        System.out.println("被删除的key队友的value是:"+value);
        System.out.println(map);



        map.clear();
        System.out.println(map);
    }
}
