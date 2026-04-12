package String;

import java.util.Scanner;

public class Ltc28 {
    public static void main(String[] args) {
//        System.out.println(helper("leetcode","leeto",0));
//        System.out.println("sum is :"+sum());
        int []nums={3,2,1,4,6,5,7};
        System.out.println(missingnum(nums));
    }
    public static int helper(String haystack,String needle,int count){
        if(haystack.isEmpty())return -1;
        if(haystack.startsWith(needle))return count;
        return helper(haystack.substring(1),needle,count+1);
    }
    public static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        if(size==0) {
            System.out.println("size should be greater than 0");
            return sum();
        }
        int []arr=new int[size];
        int sum=0;
        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        return sum;
    }
    public static int missingnum(int []nums){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}
