package String;

public class IsSubsequence {
    public static void main(String[] args) {
        String s="abc",t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        return helper(s,s.length()-1,t,t.length()-1);
    }
    public static boolean helper(String s,int indexS,String target,int indexT){
        if(indexS<0)return true;
        if(indexT<0)return false;
        if(s.charAt(indexS)==target.charAt(indexT))return helper(s,indexS-1,target,indexT-1);
        return helper(s,indexS,target,indexT-1);
    }
}
