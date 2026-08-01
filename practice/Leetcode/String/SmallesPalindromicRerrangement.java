package Leetcode.String;

import java.util.Arrays;

public class SmallesPalindromicRerrangement {
    public static void main(String[] args) {
        System.out.println(smallestPalindrome("rur"));
    }
    public static String smallestPalindrome(String s) {
        if(s.length()<=3)return s;
        char[]cArr=s.toCharArray();

        Arrays.sort(cArr);
        StringBuilder ans=new StringBuilder();
        char tripple=' ';
        if(s.length()%2==0){
            for(int i=0;i<cArr.length;i+=2){
                ans.append(cArr[i]);
            }
            ans.append(new StringBuilder(ans).reverse());
        }else{
            for(int i=0;i<cArr.length;i+=2){
                if(!ans.isEmpty()&&cArr[i]==ans.charAt(ans.length()-1))tripple=cArr[i];
                ans.append(cArr[i]);
            }
            ans.append(new StringBuilder(ans).reverse());
            if(tripple!=' ')ans.deleteCharAt(ans.length()/2);
        }
        return ans.toString();
    }
}
