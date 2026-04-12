package Leetcode.Biweekly.BW167;

public class QOne {
    public static void main(String[] args) {
        System.out.println(scoreBalance("abdcd"));
    }
    public static boolean scoreBalance(String s) {
        int len=s.length();
        int total=0;
        for(int i=0;i<len/2;i++){
            total+=s.charAt(i)-'a'+1;
        }
        int left=0;
        for(int i=0;i<len-1;i++){
            left+=s.charAt(i)-'a'+1;
            if(total-left==left)return true;
        }
        return false;
    }
}
