package Collection.Set.LinkedHmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUImplementation {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>(3,0.75f,true) {
            @Override
            public boolean removeEldestEntry(Map.Entry<String, Integer> map) {
                return size()>3;
            }
        };
        map.put("Amit",2);
        map.put("java",4);
        map.put("Puja",7);
        System.out.println(map);
        map.put("Modi",11);// as modi comes amit goes out this is LRU
        System.out.println(map);
    }
}
