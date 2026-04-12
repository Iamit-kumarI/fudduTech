package Collection.Set.HMap;

import java.util.HashMap;
import java.util.Map;

public class Hmap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Amit");
        map.put(2,"Puja");
        map.put(3,"Kr");
        System.out.println(map.containsKey("Amit"));
        System.out.println(map.containsValue("Amit"));
        System.out.println(map);
        for(int i:map.keySet()) {
            System.out.println(map.get(i));
        }
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            entry.setValue(entry.getValue().toUpperCase());//converted values to upper case
        }
        System.out.println(map);
        map.remove(2);
        System.out.println(map);
    }
}
