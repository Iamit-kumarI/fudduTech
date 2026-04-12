package Leetcode.Randome.Old;
import java.util.*;

public class Ltc35 {
    public static void main(String[] args) {
        int []nums={5,5,6,6,6,6};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count=0,candidate=0;
        for(int val:nums){
            if(count==0)candidate=val;
            count+=(val==candidate)?1:-1;
        }
        return candidate;
    }
    /* //using map
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int max=nums[0];
        for(int val:map.keySet()){
            if(map.get(val)>nums.length/2){
                max=val;
                break;
            }
        }
        return max;
     }
     */
}

