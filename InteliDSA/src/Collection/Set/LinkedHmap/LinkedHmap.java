package Collection.Set.LinkedHmap;

import java.util.LinkedHashMap;

public class LinkedHmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lmap=new LinkedHashMap<>();
        //here order is maintained
        lmap.put("apple",1);
        lmap.put("uer",2);
        lmap.put("woefh",3);
        System.out.println(lmap);
        System.out.println(lmap.getOrDefault("wei",0));
        lmap.putIfAbsent("apple",4);
        System.out.println(lmap);
    }
}
