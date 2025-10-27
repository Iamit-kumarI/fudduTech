package Recursion;

public class ReverseArray {
    //reverse using recursion
    public static void main(String[] args) {
        int []num={1,2,3,4,5,6,7,8,9,10};
        System.out.println(helper(num,0,0));
    }
    public static int helper(int []arr,int index,int sum){
        if(index==arr.length-1)return sum;
//        sum+=arr[index];
        return helper(arr,index+1,sum+arr[index]);
    }
}
