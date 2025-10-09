package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int []arr={5,6,7,2,3,5,7,2,4,6,1};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int []arr){
        if(arr==null||arr.length<=1)return;
        int max=arr[0];
        for(int num:arr){
            if(num>max)max=num;
        }
        int []freq=new int[max+1];
        for(int num:arr){
            freq[num]++;
        }
        int index=0;
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                arr[index++]=i;
                freq[i]--;
            }
        }
    }
}
