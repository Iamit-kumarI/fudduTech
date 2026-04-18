package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClosetEqualElementQueries {
    public static void main(String[] args) {
        int[]arr={1,3,1,4,1,3,2};
        int[]q={0,3,5};
        System.out.println(solveQueries(arr,q));
    }
    public static List<Integer> solveQueries(int[] nums, int[] queries) {
//        ExecutorService executor= Executors.newFixedThreadPool(nums.length);
//        try{
//            Future<List<Integer>> res=executor.submit(() ->solve(nums, queries));
//            return res.get();
//        }catch (Exception e) {
//            return new ArrayList<>();
//        }finally{
//            executor.shutdown();
//        }
        List<Integer>ans=new ArrayList<>();
        for(int val:queries){
            ans.add(helper(nums,nums[val],val));
        }
        return ans;
    }
//    public static List<Integer> solve(int[] nums, int[]queries) {
//        List<Integer>ans=new ArrayList<>();
//        for(int val:queries){
//            ans.add(helper(nums,nums[val],val));
//        }
//        return ans;
//    }
    public static int helper(int[] words, int target, int startIndex) {
        int n=words.length;
        for(int i=1;i<n;i++){
            int left=(startIndex-i+n)%n;
            int right=(startIndex+i)%n;
            if(words[left]==target||words[right]==target){
                return i;
            }
        }
        return -1;
    }
}
