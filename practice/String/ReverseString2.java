package String;

public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
    public static String reverseStr(String s, int k) {
        int right=0,n=s.length();
        StringBuilder sb=new StringBuilder();
        while(right<n){
            if(right+2<n-1){
                sb.append(s.charAt(right+1));
                sb.append(s.charAt(right));
            }
            right+=2;
            if(right<n-1)sb.append(s.charAt(right));
            if(right+1<n-1)sb.append(s.charAt(right+1));
            right+=2;
            if(n-right<=3){
                if(right+1<n)sb.append(s.charAt(right+1));
                if(right<n)sb.append(s.charAt(right));
                if(right+2<n)sb.append(s.charAt(right+2));
            }
        }
        return sb.toString();
    }
}
