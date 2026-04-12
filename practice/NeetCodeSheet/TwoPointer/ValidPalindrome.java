package NeetCodeSheet.TwoPointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        return helper(0,s.length()-1,s);
    }
    public static boolean helper(int start,int end,String str){
        if(start>end)return true;
        if(!Character.isLetterOrDigit(str.charAt(start)))return helper(start+1,end,str);
        if(!Character.isLetterOrDigit(str.charAt(end)))return helper(start,end-1,str);
        if(Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end)))return false;
        return helper(start+1,end-1,str);
    }
}
