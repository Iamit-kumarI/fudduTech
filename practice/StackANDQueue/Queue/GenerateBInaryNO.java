package StackANDQueue.Queue;

import Atcoder.ABC424.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateBInaryNO {
    public static void main(String[] args) {
        System.out.println(generateBinary(4));
    }
    public static ArrayList<String> generateBinary(int n) {
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int cur=n;
            while (cur>0){
                sb.append(cur&1);
                cur>>=1;
            }
            list.add(0,sb.reverse().toString());
            sb.setLength(0);
            n--;
        }
        return list;
    }
}
