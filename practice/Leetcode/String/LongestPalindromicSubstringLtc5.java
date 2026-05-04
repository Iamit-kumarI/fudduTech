package Leetcode.String;

public class LongestPalindromicSubstringLtc5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int n=s.length(),max=0,start=0,end=0;
        String res="";
        for(int i=0;i<n;i++){
            //streaching odd b a b
            int left=i,right=i;
            while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
//            String cur=s.substring(left+1,right);
//            if(cur.length()>res.length())res=cur;
            if((right-left+1)>max){
                max=right-left+1;
                start=left+1;
                end=right;
            }

            //even length b|b
            left=i;
            right=i+1;
            while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
//            cur=s.substring(left+1,right);
//            if(cur.length()>res.length())res=cur;
            if((right-left+1)>max){
                max=right-left+1;
                start=left+1;
                end=right;
            }
        }
        return s.substring(start,end);
    }
}
