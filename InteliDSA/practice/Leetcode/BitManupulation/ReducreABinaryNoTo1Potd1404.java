package Leetcode.BitManupulation;

public class ReducreABinaryNoTo1Potd1404 {
    public static void main(String[] args) {
        System.out.println(numSteps("1101"));
    }
    public static int numSteps(String s) {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        sb.reverse();
        while(sb.length()>1){
//            if(sb.length()==1)sb.setCharAt(0,'1');
            if(sb.charAt(0)=='1'){
                int index=0;
                while (index<sb.length()&&sb.charAt(index)=='1'){
                    sb.setCharAt(index,'0');
                    index++;
                }
                if(index<sb.length())sb.setCharAt(index,'1');
                //imp case if only 0 remaning at last
                else sb.append('1');
            }else sb.deleteCharAt(0);
            count++;
        }
        return count;
        //tle
//        int sum=0;
//        for(char c:s.toCharArray()){
//            if(c=='0'){
//                sum<<=1;
//            }
//            else {
//                sum<<=1;
//                sum+=1;
//            }
//        }
//        return helper(sum);
//    }
//    public static int helper(int sum){
//        int count=0;
//        while(sum!=1){
//            if((sum&1)==1)sum+=1;
//            else sum/=2;
//            count++;
//        }
//        return count;
    }
}
