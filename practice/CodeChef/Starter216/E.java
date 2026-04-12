package CodeChef.Starter216;

import java.util.Map;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            int low=0,high=(int)Math.sqrt(sum)+1;
            while(low<high){
                int mid=(low+high+1)>>>1;
                if(isPossible(arr,mid))low=mid;
                else high=mid-1;
            }
            sb.append(low).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isPossible(int []arr,int val){
        if(val==0)return true;
        long a=1L*val*val;
        long total=0;
        for(int num:arr){
            total+=Math.min(val,num);
            if(total>=a)return true;
        }
        return total>=a;
    }
}
