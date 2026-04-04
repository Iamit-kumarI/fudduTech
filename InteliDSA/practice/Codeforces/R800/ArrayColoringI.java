//package Codeforces.R800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayColoringI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            Map<Integer,String> map=new HashMap<>();
            String last="red";
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],last);
                if(last.equals("blue"))last="red";
                else last="blue";
            }
            Arrays.sort(arr);
            boolean ans=false;
            String curLast=map.get(arr[0]);
            for(int i=1;i<arr.length;i++){
                String cur=map.get(arr[i]);
                if(cur.equals(curLast))ans=true;
                curLast=cur;
            }
            System.out.println(ans?"No":"Yes");
        }
    }
}
