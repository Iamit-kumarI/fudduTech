package Leetcode.String;

import java.util.*;

public class POTD2273 {
    public List<String> removeAnagrams(String[] words) {
        Set<String> set=new HashSet<>();
        int i=0,cat=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(String str:words){
            char []arr=str.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(set.contains(arr)) {
                cat++;
                continue;
            }
            list.add(cat++);
            set.add(sorted);
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int val:list){
            ans.add(words[val]);
        }
        return ans;
        //only match with last one
    }
}
