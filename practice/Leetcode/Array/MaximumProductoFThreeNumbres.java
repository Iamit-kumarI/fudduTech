package Leetcode.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumProductoFThreeNumbres {
    public static void main(String[] args) {
        int[]arr={-1,-2,-3};
        System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        int negativeCount=0;
        int nFirst=Integer.MAX_VALUE,nSecond=Integer.MAX_VALUE,nThird=Integer.MAX_VALUE;
        for(int val:nums){
            if(val<0)negativeCount++;
            if(val>first){
                third=second;
                second=first;
                first=val;
            }else if(val>second){
                third=second;
                second=val;
            }else if(val>third)third=val;
            //negative smallest
            if(val<nFirst){
                nThird=nSecond;
                nSecond=nFirst;
                nFirst=val;
            }else if(val<nSecond){
                nThird=nSecond;
                nSecond=val;
            }else if(val<nThird)nThird=val;

        }
        int nmax=0,pmax=0;
        if(negativeCount>=2){
            nmax=nFirst*nSecond*first;
        }
        pmax=first*second*third;
        return Math.max(pmax,nmax);
    }
}
