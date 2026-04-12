package Leetcode.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TDay33 {
    public static void main(String[] args) {
        String[]words={"a","banana","app","appl","ap","apply","apple"};
        System.out.println(longestWord(words));
    }
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set=new HashSet<>();
        String ans=" ";
        for(String str:words){
            if(str.length()==1||set.contains(str.substring(0,str.length()-1))){
                set.add(str);
                if(str.length()>ans.length())ans=str;
            }
        }
        return ans;
    }
}

