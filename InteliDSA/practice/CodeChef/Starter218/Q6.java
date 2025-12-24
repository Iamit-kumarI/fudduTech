package CodeChef.Starter218;

import java.util.*;

public class Q6 {
    static final long f=(long)1e18;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println(solve(sc.nextLong())?"Yes":"No");
        }
    }
    public static boolean solve(long n){
        Set<Long> set=new HashSet<>();
        Queue<Long>queue=new LinkedList<>();
        long limit=Math.min(f,n*2);
        queue.offer(n);
        while(!queue.isEmpty()){
            long cur=queue.poll();
            if(cur==1)return true;
            if(cur<0||cur>limit)continue;
            if(!set.add(cur))continue;
            long xor=(3^cur)+1;
            if(xor<limit)queue.offer(xor);
            if((cur&1)==0)queue.offer(cur/2);
        }
        return false;
    }
}
