package Leetcode.Biweekly.BW173;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abbc",2));
    }
    public static String reversePrefix(String s, int k) {
        StringBuilder res=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        boolean found=true;
        for(char ch:s.toCharArray()){
            sb.append(ch);
            if(sb.length()==k&&found){
                res.append(sb.reverse());
                found=false;
                continue;
            }
            if(!found)res.append(ch);
        }
        return res.toString();
    }
}
