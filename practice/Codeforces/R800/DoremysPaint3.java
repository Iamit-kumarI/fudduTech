package Codeforces.R800;

import java.util.HashMap;
import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                map.put(val,map.getOrDefault(val,0)+1);
            }
            boolean possible=false;
            if(map.size()>=3){
                System.out.println("No");
                continue;
            }
            if(map.size()==1){
                System.out.println("Yes");
                continue;
            }
            for(Integer freq:map.values()){
                if(freq==n/2||freq==(n+1)/2)possible=true;
            }
            System.out.println(possible?"Yes":"No");
        }
    }
}
