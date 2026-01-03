package Atcoder.ABC439;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]count=new int[n+1];
        int lim=(int)Math.sqrt(n);
        for(int i=1;i<=lim;i++){
            int square=i*i;
            for(int x=1;x<i;x++){
                int cur=x*x+square;
                if(cur>n)break;;
                count[cur]++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)if(count[i]==1)list.add(i);
        System.out.println(list.size());
        if(!list.isEmpty()){
            for(int i=0;i<list.size();i++){
                if(i>0) System.out.print(" ");
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
