package CodeChef.Starter227;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer>map=new HashMap<>();
            HashSet<Integer>set=new HashSet<>();
            int ans=0;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                map.put(val,map.getOrDefault(val,0)+1);
                if(map.get(val)==2&&!set.contains(val)){
                    ans++;
                    set.add(val);
                }
            }
            System.out.println(ans);
        }
    }
}
