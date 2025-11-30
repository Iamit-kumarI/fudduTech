package Leetcode.String;

public class Subseq392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","c"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty())return true;
        int lastindex=-1;
        for(char c:s.toCharArray()){
            int cur=t.indexOf(c,lastindex+1);
            if(cur==-1)return false;
            lastindex=cur;
        }
        return true;
    }
}
