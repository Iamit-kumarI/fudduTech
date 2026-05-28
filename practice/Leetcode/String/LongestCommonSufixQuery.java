package Leetcode.String;

import java.util.*;

public class LongestCommonSufixQuery {
    public static void main(String[] args) {
        String[]word={"abcdefgh","poiuygh","ghghgh"};
        String[]query={"gh","acbfgh","acbfegh"};
        System.out.println(Arrays.toString(stringIndices(word,query)));
    }
    public static int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        int n=wordsQuery.length;
        int[]ans=new int[n];
        int index=0;
        for(String word:wordsQuery){
            ans[index++]=helper(word,wordsContainer);
        }
        return ans;
    }
    public static int helper(String target,String[]container){
        List<Pair> list=new ArrayList<>();
        for(int i=0;i<container.length;i++){
            if(exist(target,container[i])){
                list.add(new Pair(i,container[i].length()));
            }
        }
        if(list.isEmpty())return 1;
        if(list.size()==1)return list.get(0).index;
        int ans=list.get(0).index;
        list.sort((a,b)->a.len-b.len);
        if(list.get(0).len<list.get(1).len)return list.get(0).index;
        return ans;
    }
    static class Pair{
        int index;
        int len;
        Pair(int index,int len){
            this.index=index;
            this.len=len;
        }
    }
    public static boolean exist(String check,String continer){
        for(char cur:check.toCharArray()){
            if(continer.indexOf(cur)==-1)return false;
        }
        return true;
    }
}
