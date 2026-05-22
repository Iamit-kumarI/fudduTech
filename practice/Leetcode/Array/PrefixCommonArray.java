package Leetcode.Array;

import java.util.*;

public class PrefixCommonArray {
    public static void main(String[] args) {
        int[]arr1={2,3,1};
        int[]arr2={3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(arr1,arr2)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        Set<Integer>list1=new HashSet<>();
        Set<Integer>list2=new HashSet<>();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            list2.add(B[i]);
            list1.add(A[i]);
            if(A[i]==B[i]){
                if(i!=0)ans[i]=ans[i-1]+1;
                else ans[i]=1;
            }else{
                if(i==0)ans[i]=0;
                else{
                    int curAdd=0;
                    if(list1.contains(B[i]))curAdd++;
                    if(list2.contains(A[i]))curAdd++;
                    ans[i]=curAdd;
                }
            }
        }
        return ans;
    }
}
