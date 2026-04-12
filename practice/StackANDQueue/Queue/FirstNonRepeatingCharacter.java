package StackANDQueue.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="aabc";
        System.out.println(firstNonRepeating(str));
    }
    public static String firstNonRepeating(String s) {
        int n=s.length();
        if(n==0)return "";
        HashMap<Character,Integer>map=new HashMap<>();
        Queue<Character>queue=new LinkedList<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char cur=s.charAt(i);
            map.put(cur,map.getOrDefault(cur,0)+1);
            queue.add(cur);
            while (!queue.isEmpty()&&map.get(queue.peek())>1){
                queue.poll();
            }
            if(queue.isEmpty())ans.append('#');
            else ans.append(queue.peek());
        }
        return ans.toString();
    }
}
