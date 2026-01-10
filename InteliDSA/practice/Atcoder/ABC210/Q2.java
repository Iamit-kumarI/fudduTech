package Atcoder.ABC210;

import java.util.*;

public class Q2 {
    public static class Horse{
        int time;
        int index;
        Horse(int time,int index){
            this.time=time;
            this.index=index;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Horse> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int t=sc.nextInt();
            list.add(new Horse(t,i));
        }
        Collections.sort(list,(a, b)->a.time-b.time);
        System.out.println(list.get(0).index+" "+list.get(1).index+" "+list.get(2).index);

    }
}
