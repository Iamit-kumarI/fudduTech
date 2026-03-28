package Atcoder.ABC451;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        Set<Long>set=new HashSet<>();
        while(q-->0){
            int type=sc.nextInt();
            long tree=sc.nextInt();
            if(type==1){
               set.add(tree);
            }else{
                List<Long>list=new ArrayList<>();
                for(long val:set){
                    if(val<=tree)list.add(val);
                }
                for(long val:list)set.remove(val);
            }
            System.out.println(set.size());
        }
    }
}
