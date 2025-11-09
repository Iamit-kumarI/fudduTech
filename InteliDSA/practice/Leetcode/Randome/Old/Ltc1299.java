package Leetcode.Randome.Old;

import java.util.Arrays;

public class Ltc1299 {
    public static void main(String[] args) {
        int []arr={17,18,5,4,6,1};
//        System.out.println(replaceElements(arr));
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        int lastmax=max;
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>-1;i--){
            if(arr[i]>max)lastmax=arr[i];
            arr[i]=max;
            max=lastmax;

        }
        return arr;
    }
}
