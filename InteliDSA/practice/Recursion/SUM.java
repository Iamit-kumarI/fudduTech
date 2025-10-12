package Recursion;

public class SUM {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(sum(arr));
    }
    public static int sum(int [] arr){
        return helper(arr,0,0);
    }
    public static int helper(int []arr,int index,int sum){
        if(index==arr.length)return sum;
        sum+=arr[index];
        return helper(arr,index+1,sum);
    }
}
