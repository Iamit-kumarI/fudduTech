package NeetCodeSheet.ArraysHashing;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[]strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>ans=groupAnagrams(strs);
        for(List<String>cur:ans) System.out.println(cur);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String>list=new ArrayList<>();
            list.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(strs[j]!="-1"&&isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                    strs[j]="-1";
                }
            }
            if(list.size()==1&&list.get(0).equals("-1"))continue;
            ans.add(list);
        }
        return ans;
    }
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length())return false;
        Map<Character,Integer>map=new HashMap<>();
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
