package TwoPointerSlidingWIndow;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[]arr={1,2,1,2,3};
        System.out.println(subarraysWithKDistinct(arr,2));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[]arr,int k){
        if(k<0)return 0;
        int left=0,right=0,ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(right<arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)map.remove(arr[left]);
                left++;
            }
            ans+=(right-left+1);
            right++;
        }
        return ans;
    }
}
