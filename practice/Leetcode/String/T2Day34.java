package Leetcode.String;

public class T2Day34{
    public static void main(String[] args) {
        String[]words={"pay","attention","practice","attend"};
        System.out.println(prefixCount(words,"at"));
    }
    public static int prefixCount(String[] words, String pref) {
        int count=0;
        for(String str:words)if(str.startsWith(pref))count++;
        return count;
    }
}
