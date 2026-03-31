package String;

public class POTD2840 {
    public static void main(String[] args) {
        System.out.println(checkStrings("abcdba","cabdab"));
    }
    public static boolean checkStrings(String s1, String s2) {
        return helper(new StringBuilder(s1),new StringBuilder(s2),0);
    }
    public static boolean helper(StringBuilder text1,StringBuilder text2,int index){
        if(index>text1.length())return false;
        if(text1.compareTo(text2)==0)return true;
        boolean noTSwap=helper(text1,text2,index+1);
        boolean swap=false;
        if(index+2<text1.length())swap=helper(Swap(text1,index,index+1),text2,index+1);
        return noTSwap||swap;
    }
    public static StringBuilder Swap(StringBuilder sb,int i,int j){
        char c=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,c);
        return sb;
    }
}
