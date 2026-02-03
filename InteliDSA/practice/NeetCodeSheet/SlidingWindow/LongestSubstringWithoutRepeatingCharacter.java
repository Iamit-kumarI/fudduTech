package NeetCodeSheet.SlidingWindow;


//dry run needed
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongstSubstring(s));
    }
    public static int lengthOfLongstSubstring(String str){
        if(str.length()==0)return 0;
        return helper(str,0,1,1,1);
    }
    public static int helper(String str,int start,int end,int currentMax,int max){
        if(end==str.length())return Math.max(currentMax,max);
        if(str.substring(start,end).indexOf(str.charAt(end))==-1){
            return helper(str,start,end+1,currentMax+1,Math.max(currentMax+1,max));
        }
        return helper(str,start+1,end,currentMax-1,max);
    }
}
