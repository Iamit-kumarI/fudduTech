package Leetcode.Randome.Old;

public class Ltc28 {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","leeto"));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return -1;
        /*faster solution*/
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<n-m;i++){
            if(haystack.substring(i,m+i).equals(needle)){
                return i;
            }
        }
        return -1;

        /*brute force solution*/
//        for (int i = 0; i <haystack.length() ; i++) {
//            int j=0;
//            while(j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
//                j++;
//            }
//            if(j==needle.length()) return i;
//        }
//        return -1;
    }
}
