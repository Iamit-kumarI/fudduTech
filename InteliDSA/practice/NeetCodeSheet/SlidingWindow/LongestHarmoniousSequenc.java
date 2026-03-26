package NeetCodeSheet.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSequenc {
    public static void main(String[] args) {
        int[]arr={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }
    public static int findLHS(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int val:nums)map.put(val,map.getOrDefault(val,0)+1);
        int max=0;
        for(int val:map.keySet()){
            int cur=map.get(val);
            int nCur=cur+map.getOrDefault((val+1),-cur);
            if(nCur>max)max=nCur;
        }
        return max;
    }
}
