package Leetcode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GfgPOTD {
    public static void main(String[] args) {
        System.out.println(areIsomorphic("aab","xxy"));
    }
    public static boolean areIsomorphic(String s1, String s2) {
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                if(map.get(s2.charAt(i))!=s1.charAt(i))return false;
            }else{
                map.put(s1.charAt(i),s2.charAt(i));
            }
        }
        return true;
    }
}
