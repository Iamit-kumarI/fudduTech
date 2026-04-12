package Atcoder.ABC448;

import java.util.*;

public class Q3 {
    static class Pair{
        int val,index;
        Pair(int val,int index){
            this.val=val;
            this.index=index;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        Pair[]pair=new Pair[n];
        for(int i=0;i<n;i++){
            pair[i]=new Pair(sc.nextInt(),i+1);
        }
        Arrays.sort(pair,(a,b)->a.val-b.val);
        while(q-->0){
            int k=sc.nextInt();
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<k;i++)set.add(sc.nextInt());
            for(int i=0;i<n;i++){
                if(!set.contains(pair[i].index)){
                    System.out.println(pair[i].val);
                    break;
                }
            }
        }
    }
}
