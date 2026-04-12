package Collection.Set.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap<S, I extends Number> {
    public static void main(String[] args) {
        SortedMap<String,Integer>map= new TreeMap<>();
        //values here will be sorted on the bases of keys
        map.put("Mohit",89);
        map.put("Amit",87);
        map.put("Puja",86);
//        System.out.println(map);//sorted like A -> M -> P
        map.put("Tena",90);
        map.put("Ruller",88);
        System.out.println(map.tailMap("Mohit"));
        System.out.println(map.headMap("Puja"));
        System.out.println(map.lastKey());
        System.out.println(map.firstKey());
        System.out.println(map.firstEntry());
    }
}
