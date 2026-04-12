package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthLexographicStringHappyLtc1415 {
    public static void main(String[] args) {
        System.out.println(getHappyString(3,9));
    }
    public static String getHappyString(int n, int k) {
        List<String> list=new ArrayList<>();
        helper(n,list,new StringBuilder());
        if(list.size()<k)return " ";
        return list.get(k-1);
    }
    public static void helper(int n,List<String> list,StringBuilder sb){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        char[]carr={'a','b','c'};
        for(char c:carr){
            if(sb.length()>0&&sb.charAt(sb.length()-1)==c)continue;
            sb.append(c);
            helper(n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
