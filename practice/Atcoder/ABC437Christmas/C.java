package Atcoder.ABC437Christmas;

import java.util.Arrays;
import java.util.Scanner;
//help taken
public class C {
    static class Reinder{
        long w,p;
        Reinder(long w,long p){
            this.w=w;
            this.p=p;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Reinder[]arr=new Reinder[n];
            long total=0;
            for(int i=0;i<n;i++){
                long w=sc.nextLong();
                long p=sc.nextLong();
                arr[i]=new Reinder(w,p);
                total+=p;
            }
            Arrays.sort(arr,(a,b)->Long.compare(a.w+a.p,b.w+b.p));
            long temprendinder=0;
            int answer=0;
            for(int i=0;i<n;i++){
                temprendinder+=arr[i].w;
                total-=arr[i].p;
                if(total>=temprendinder)answer++;
                else break;
            }
            System.out.println(answer);
        }
    }
}
