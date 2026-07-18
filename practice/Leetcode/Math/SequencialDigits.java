package Leetcode.Math;

import java.util.*;

public class SequencialDigits {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100,300));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
//        List<Integer>list=new ArrayList<>();
        TreeSet<Integer> list=new TreeSet<>();
        String str="123456789";
        for(int start=0;start<str.length();start++){
            for(int end=start+1;end<=str.length()&&start!=end;end++){
                int digit=Integer.parseInt(str.substring(start,end));
                if(digit>=low&&digit<=high)list.add(digit);
            }
        }
        return list.stream().toList();
    }
}
