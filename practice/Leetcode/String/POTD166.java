package Leetcode.String;
//
public class POTD166 {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,333));
    }
    public static String fractionToDecimal(int numerator, int denominator) {
        String str="";
//        float val=numerator/denominator;
//        if(val==Math.floor(val)){
//            return val+"";
//        }
        if(numerator>denominator){
            return Math.round(((float)numerator/denominator)*1000.0)/1000.0+"";
        }
        if(numerator==denominator)return 1+"";
        int val=numerator/denominator;
        float num=numerator;
        int count=0;
//        String zero="0";
        while(num/denominator<1){
            count++;
//            zero+="0";
            num*=10;
        }
        float ans=num/denominator;
        String res=String.format("%.3f",ans/(float)Math.pow(10,count));
        if(count>1){
            return val+".("+res.substring(2)+")";//only take till 3 decimal thats why substring of 2
        }
        return val+"."+res.substring(2);
    }
}
