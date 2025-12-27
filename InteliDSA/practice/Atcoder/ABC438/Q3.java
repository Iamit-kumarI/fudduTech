package Atcoder.ABC438;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {//do it stack we
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(int val:map.values()){
            ans+=val%4;
        }
        System.out.println(ans);
    }
}
