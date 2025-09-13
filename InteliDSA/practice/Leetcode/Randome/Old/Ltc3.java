package Leetcode.Randome.Old;
/*failing to handle abcabcbb
* here is is returing 5 should be returning 3*/
public class Ltc3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        return helper(s,0,1,1,1);
    }
    public static int helper(String s,int index,int incIndex,int subStringlen,int finallen){
        if(s.isEmpty()){
            return 0;
        }
        if(subStringlen>finallen){
            finallen=subStringlen;
        }
        if(index==s.length()||incIndex==s.length()){
            return subStringlen;
        }
        if(s.charAt(index)!=s.charAt(incIndex)){
            return helper(s,index,incIndex+1,subStringlen+1,finallen);
        }
        return helper(s,index+1,index+2,1,finallen);
    }
}
