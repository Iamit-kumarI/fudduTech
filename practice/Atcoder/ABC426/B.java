package Atcoder.ABC426;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    // odd one out
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> freq : map.entrySet()){
            if(freq.getValue()==1){
                System.out.println(freq.getKey());
            }
        }
    }
}
