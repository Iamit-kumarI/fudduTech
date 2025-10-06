package Atcoder.ABC426;

import java.util.HashMap;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        // now will do it via map
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Ocelot",1);
        map.put("Serval",2);
        map.put("Lynx",3);
        if(map.get(str1)>=map.get(str2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
