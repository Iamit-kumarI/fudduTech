//package Leetcode.Randome.Old;
//import java.util.*;
//
//public class Ltc3SUM {
//    public static void main(String[] args) {
//        int []nums={0,0,0};
//        List<List<Integer>> list=threeSum(nums);
//        System.out.println(list(0));
//    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> set=new HashSet();
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length-1;j++){
//                for(int k=j+1;k<nums.length-1;k++){
//                    if((nums[i]+nums[j]+nums[k])==0){
//                        List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
//                        list.sort(null);
//                        set.add(list);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> ans=new ArrayList<>(set);
//        return ans;
//    }
//}
