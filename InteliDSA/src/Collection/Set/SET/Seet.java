package Collection.Set.SET;

import java.util.*;
import java.util.stream.Collectors;

public class Seet {
    public static void main(String[] args) {
        Map<Integer,String>db=new HashMap<>();
        db.put(101,"Amit");
        db.put(102,"Aditi");
        db.put(103,"Rahul");
        System.out.println(db);
        for(Map.Entry<Integer,String>enteries:db.entrySet()){
            System.out.print(enteries.getValue()+" ");
        }
    }
}
