package Leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] arr={"bella","label","roller"};
        System.out.println(commonChars(arr));
    }
    public static List<String> commonChars(String[] words) {
        Map<Character,Integer>map=new HashMap<>();
        int index=0;
        for(String cur:words){
            for(char c:cur.toCharArray()){
                if(map.get(c)==null||map.get(c)<=index){
                    map.put(c,map.getOrDefault(c,0)+1);
                }
            }
            index++;
        }
        List<String>ans=new ArrayList<>();
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==index)ans.add(entry.getKey()+"");
        }
        return ans;
    }
}
