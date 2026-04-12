package Atcoder.ABC444;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//not working
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[]arr=new long[n];
        long sum=0,max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            max= Math.max(max,arr[i]);
        }
        Set<Long> set=new TreeSet<>();
        for(long i=1;i*i<=sum;i++){
            if(sum%i==0){
                long b=sum/i;
                if(isValidCombo(i,arr)&&i>=max)set.add(i);
                if(i!=b&&isValidCombo(b,arr)&&b>=max)set.add(b);
            }
        }
        for(long cur:set) System.out.print(cur+" ");
    }
    public static boolean isValidCombo(long a,long[]arr){
        long sum=0L;
        for(long cur:arr){
           sum+=cur;
           if(sum>a)return false;
           if(sum==a)sum=0;
        }
        return sum==0;
    }
}
