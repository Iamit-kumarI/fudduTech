package Atcoder.ABC446;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3 {
   static public class Eggs{
        int day;
        long count;
        Eggs(int day,long count){
            this.day=day;
            this.count=count;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            long[]a=new long[n];
            long[]b=new long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            for(int i=0;i<n;i++)b[i]=sc.nextLong();
            Queue<Eggs>queue=new LinkedList<>();
            long total=0;
            for(int i=0;i<n;i++){
                queue.offer(new Eggs(i,a[i]));
                total+=a[i];

                long need=b[i];
                while(need>0){
                    Eggs cur=queue.peek();
                    if(cur.count<=need){
                        need-=cur.count;
                        total-=cur.count;
                        queue.poll();
                    }else{
                        cur.count-=need;
                        total-=need;
                        need=0;
                    }
                }
                while(!queue.isEmpty()&&i-queue.peek().day>=d)total-=queue.poll().count;
            }
            System.out.println(total);
        }
    }
}
