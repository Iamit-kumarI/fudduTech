package Leetcode.BitManupulation;

public class AddBitsNto1Ltc1680 {
    public static void main(String[] args) {
        System.out.println(concatenatedBinary(42));
    }
    public static int concatenatedBinary(int n) {
        StringBuilder sb=new StringBuilder(toBinaryString(n));
        long sum=0;
        for(char c:sb.toString().toCharArray()){
            sum<<=1;
            if(c=='1')sum+=1;
        }

        return (int)(sum%1000000007);
    }
    public static StringBuilder toBinaryString(int n){
        StringBuilder sb=new StringBuilder();
        while (n>0){
//            sb.append(Integer.toBinaryString(n));
            sb.insert(0,Integer.toBinaryString(n));
            n--;
        }
        return sb;
    }
}
