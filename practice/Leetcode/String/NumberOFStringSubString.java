package Leetcode.String;

public class NumberOFStringSubString {
    public static void main(String[] args) {
        String[]arr={"a","abc","bc","d"};
        System.out.println(numOfStrings(arr,"abc"));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String val:patterns){
            if(word.contains(val))ans++;
        }
        return ans;
    }
}
