package Leetcode.Weekly.Weekly491;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(trimTrailingVowels("idea"));
    }
    public static String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        boolean vowelFound=false;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(!vowelFound&&isVowel(c)){
                continue;
            }else if(!vowelFound) {
                vowelFound=true;
                sb.append(c);
                continue;
            }
            if(vowelFound)sb.append(c);
        }
        return sb.reverse().toString();
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
        return false;
    }
}
