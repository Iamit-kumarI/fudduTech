package StackANDQueue.CPTracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BasicCalculation {
    public static void main(String[] args) {
        String str="3+2*2";
        System.out.println(calculate(str));
    }
    public static int calculate(String s) {
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }else{
                list.add(sb.toString());
                sb.setLength(0);
                list.add(String.valueOf(c));
            }
            list.add(sb.toString());
        }
        String[]arr=list.toArray(new String[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals("*")){
                int left=1;
                int right=1;
                int val=left*right;
            }
        }
        System.out.println(arr[4]);
        return 1;
    }
}
