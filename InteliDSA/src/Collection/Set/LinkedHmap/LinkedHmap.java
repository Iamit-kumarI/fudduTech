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
    }
}
