package Leetcode.Biweekly.BW176;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        String[]words={"car","cat","cartoon"};
        System.out.println(prefixConnected(words,3));
    }
    public static int prefixConnected(String[] words, int k) {
//        int ans=0;
//        for(int i=0;i<words.length;i++){
//            if(words[i].length()<k)continue;
//            String cur=words[i];
//            for(int j=i+1;j<words.length;j++){
//                if(words[j].length()<k)continue;
//                boolean status=true;
//                for(int p=0;p<k;p++){
//                    if(cur.charAt(p)!=words[j].charAt(p)){
//                        status=false;
//                        break;
//                    }
//                }
//                if(status)ans++;
//            }
//        }
//        return ans;
        Map<String,Integer> map=new HashMap<>();
        for(String cur:words){
            if(cur.length()<k)continue;
            String prefix=cur.substring(0,k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        int ans=0;
        for(int val:map.values()){
            if(val>=2)ans++;
        }
        return ans;
    }
}
