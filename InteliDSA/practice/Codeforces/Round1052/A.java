package Codeforces.Round1052;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int len=sc.nextInt();
            int[]arr=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(subsequence(arr));;
        }
    }
    public static int subsequence(int[]arr){
        HashMap<Integer, Integer> freqmap=new HashMap<>();
        for(int val:arr){
            freqmap.put(val,freqmap.getOrDefault(val,0)+1);
        }
        List<Integer> freqcount=new ArrayList<>(freqmap.values());
        freqcount.sort(Comparator.reverseOrder());
        int max=0,count=1;
        for(int i=0;i<freqcount.size();i++){
            int val=0;
            val=freqcount.get(i)*count++;
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
