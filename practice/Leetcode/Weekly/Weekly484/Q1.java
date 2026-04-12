package Leetcode.Weekly.Weekly484;

public class Q1 {
    public int residuePrefixes(String s) {
        boolean[]barray=new boolean[26];
        int unqiue=0,res=0;
        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i)-'a';
            if(!barray[cur]){
                barray[cur]=true;
                unqiue++;
            }
            int mod=(i+1)%3;
            if(mod==unqiue)res++;
        }
        return res;
    }
}
