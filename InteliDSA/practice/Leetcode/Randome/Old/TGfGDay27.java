package Leetcode.Randome.Old;

public class TGfGDay27 {
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("output"));
    }
    public static char getMaxOccuringChar(String s) {
        // code here
        int[]freq=new int[26];
        int max=0,lastmax=0;
        int index=0;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            if(freq[c-'a']>=max){
                lastmax=max;
                index=c-'a';
                max=freq[c-'a'];
            }
        }
        if(max>lastmax)return (char)('a'+index);
        if(max==lastmax){
            int i=0;
            for(int val:freq){
                if(val==max)return (char) ('a'+i+1);
                else i++;
            }
        }
        return ' ';
    }
}
