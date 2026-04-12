package String;

public class Ltc2144 {
    public static void main(String[] args) {
        String[]str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }
    public static int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String str:sentences){
            String[]cur=str.split(" ");
            ans=Math.max(ans,cur.length);
        }
        return ans;
    }
}
