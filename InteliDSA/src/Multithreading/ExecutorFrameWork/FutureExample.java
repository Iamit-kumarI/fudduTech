package Multithreading.ExecutorFrameWork;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[]arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,18)));
    }
    public static int[] twoSum(int[] nums, int target) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(nums.length);
        try{
            Future<int[]>res=executor.submit(() ->helper(nums, target));
            return res.get();
        }catch (Exception e) {
            return new int[]{-1,-1};
        }finally{
            executor.shutdown();
        }
    }
    public static int[]helper(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
