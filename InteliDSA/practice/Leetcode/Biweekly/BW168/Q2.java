package Leetcode.Biweekly.BW168;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(maxSumOfSquares(2,17));
    }
    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int cdigit = Math.min(9, sum);
            sb.append(cdigit);
            sum -= cdigit;
        }
        if (sum != 0) return "";
        return sb.toString();
    }
//    public static int noOfDigitInNum(int num){
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
//    }
    public static int sumOfDigits(int digit){
        int sum=0;
        while(digit>0){
            sum+=digit%10;
            digit/=10;
        }
        return sum;
    }
    public static int squareOfSumDigits(int sum){
        int sq=0;
        while(sum>0){
            sq+=(sum%10)*(sum%10);
            sum/=10;
        }
        return sq;
    }
}
