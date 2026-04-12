package Collection.Set.SortedMap;

import java.util.*;

public class Navigablemap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>nmap=new TreeMap<>();
        nmap.put(3,"Amit");
        nmap.put(5,"Puja");
        nmap.put(4,"Tena");
        nmap.put(7,"Ruller");
        System.out.println(nmap);
        System.out.println(nmap.lowerKey(4));//key just above 4
        System.out.println(nmap.higherKey(4));//key just above 4
        System.out.println(nmap.descendingMap());
        System.out.println(nmap.pollLastEntry());
        System.out.println(nmap.reversed());
    }
}
