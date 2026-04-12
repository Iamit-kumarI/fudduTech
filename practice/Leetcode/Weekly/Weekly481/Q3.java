//package Leetcode.Weekly.Weekly481;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Q3 {
//    public int minSwaps(int[] nums, int[] forbidden) {
//        int n = nums.length;
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int val : nums) {
//            map1.put(val, map1.getOrDefault(val, 1) + 1);
//        }
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != forbidden[i]) map2.put(forbidden[i], map2.getOrDefault(forbidden[i], 1) + 1);
//        }
////        int total=0;
//        for (int val : map1.keySet()) {
//            int total = map1.get(val);
//            int permitted = n - map2.getOrDefault(val, 0);
//            if (total > permitted) return -1;
//        }
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<n;i++)
//    }
//}