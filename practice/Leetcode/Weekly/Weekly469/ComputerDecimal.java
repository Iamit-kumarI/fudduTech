package Leetcode.Weekly.Weekly469;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerDecimal {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decimalRepresentation(537)));
    }
    public static int[] decimalRepresentation(int n) {
        List<Integer> result=new ArrayList<>();
        int counter=1,rem=0;
        while(n>0){
            rem=n%10;
            result.add(0,rem*counter);
            counter*=10;
            n/=10;
        }
        List<Integer> list=new ArrayList<>();
        for(int num:result){
            if(num!=0)list.add(0,num);
        }
        int []arr=new int[list.size()];
        int index=0;
        for(int num:list){
            if(num!=0){
                arr[index++]=num;
            }
        }
        return arr;
    }
}
