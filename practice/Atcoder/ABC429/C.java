package Atcoder.ABC429;

import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val= sc.nextInt();;
            map.put(val, map.getOrDefault(val,0L)+1);
        }
        long ans=0;
        for(long num: map.values()){
            if(num>=2)ans+=(num*(num-1)/2)*(n-num);
        }
        System.out.println(ans);

    }
}
