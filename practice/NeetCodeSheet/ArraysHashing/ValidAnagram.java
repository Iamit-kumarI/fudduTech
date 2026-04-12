package NeetCodeSheet.ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="rat",t="car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer>map=new HashMap();
        for(char c:s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)==1)map.remove(c);
                else map.put(c,map.get(c)-1);
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
