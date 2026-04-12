package Atcoder.ABC436;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    static final long sval=1000000005L;
    static long convert(long row,long col){
        return row*sval+col;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Long> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<m;i++){
            long r=sc.nextLong();
            long c=sc.nextLong();
            long[]cells={
                    convert(r,c),
                    convert(r+1,c),
                    convert(r,c+1),
                    convert(r+1,c+1)
            };
            boolean isOverLab=false;
            for(long cell:cells){
                if(set.contains(cell)){
                    isOverLab=true;
                    break;
                }
            }
            if(!isOverLab){
                for(long cell:cells){
                    set.add(cell);
                }
                ans++;
            }

        }
        System.out.println(ans);
    }
}
