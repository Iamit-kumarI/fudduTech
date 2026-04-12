package Leetcode.Math;

import java.util.HashSet;

public class POTD1925 {
    public static void main(String[] args) {
        System.out.println(countTriples(10));
    }
    public static int countTriples(int n) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<=n;i++)set.add(i*i);
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(set.contains((i*i)+(j*j)))count++;
            }
        }
        return count;
    }
}
