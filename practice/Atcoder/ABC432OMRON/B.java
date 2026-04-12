package Atcoder.ABC432OMRON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x/=10;
        }
        Collections.sort(list);
        int index=0;
        while(index<list.size()&&list.get(index)==0)index++;
        int ans=list.get(index);
        for(int i=0;i<list.size();i++){
            if(i==index)continue;
            ans=ans*10+list.get(i);
        }
        System.out.println(ans);
    }
}
