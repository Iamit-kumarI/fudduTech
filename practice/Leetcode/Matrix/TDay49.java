package Leetcode.Matrix;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

public class TDay49 {
    public long countStableSubarrays(int[] cap) {
        HashMap<String,Integer> map = new HashMap<>();
        long sum = 0;
        long ans = 0;
        String prev = "";
        for(int i=0; i<cap.length; i++) {
            sum = sum + cap[i];
            long z = sum-(2*cap[i]);
            String x = cap[i]+" "+(z);
            if(map.containsKey(x)) {
                ans = ans + map.get(x);
            }
            String l = cap[i]+" "+sum;
            if(i!=0) {
                map.put(prev,map.getOrDefault(prev,0)+1);
            }
            prev = l;
        }
        return ans;
        //above solution is optimise with help of gpt
//_____________________________________________________________________________________________
        //this has TLE on test cas 744
//        int n=capacity.length;
//        if(n<3)return 0;
//        long count=0;
//        for(int i=0;i<n;i++){
//            long sum=0;
//            for(int j=i+1;j<n;j++){
//                if(j>i+1){
//                    sum+=capacity[j-1];
//                }
//                if(j>=i+2){
//                    if(sum==capacity[i]&&capacity[i]==capacity[j])count++;
//                }
//            }
//        }
//        return count;
    }
}