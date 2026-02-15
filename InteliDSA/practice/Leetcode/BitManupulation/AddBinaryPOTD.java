package Leetcode.BitManupulation;

public class AddBinaryPOTD {
    public static void main(String[] args) {
        String a="1011";
        String b="1010";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        //this won't work if no goes big -> use carray method
        int sum=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1')sum+=1<<(a.length()-1-i);
        }
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1')sum+=1<<(b.length()-1-i);
        }
        StringBuilder sb=new StringBuilder();
        while(sum>0){
            sb.append(sum%2);
            sum=sum>>1;
        }
        if(sb.isEmpty())return "0";
        return sb.reverse().toString();
    }
}
