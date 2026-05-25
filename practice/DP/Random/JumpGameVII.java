package DP.Random;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameVII{
    public static void main(String[] args) {
        System.out.println(canReach("011010",2,3));
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer>queue=new LinkedList<>();
        int len=s.length()-1;
        if(s.charAt(len)!='0')return false;
        queue.offer(0);
        int end=0;
        while(!queue.isEmpty()){
            int cur=queue.poll();
            if(cur==len)return true;
            int tempMin=Math.max(minJump+cur,end+1);
            int tempMax=Math.min(maxJump+cur,len);
            while(tempMin<=tempMax){
                if(tempMin>len)break;
                if(s.charAt(tempMin)=='0')queue.offer(tempMin);
                tempMin++;
            }
            end=tempMax;
        }
        return false;
    }
}
