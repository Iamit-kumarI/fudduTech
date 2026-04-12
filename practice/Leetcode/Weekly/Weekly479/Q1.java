package Leetcode.Weekly.Weekly479;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[]nums={3,6,5,8};
        System.out.println(Arrays.toString(sortByReflection(nums)));
    }
    public static int[] sortByReflection(int[] nums) {
        Integer[]arr=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(val1,val2)->{
            int ref1=mirror(val1);
            int ref2 =mirror(val2);
            if(ref1!=ref2)return ref1-ref2;
            return val1-val2;
        });
        return Arrays.stream(arr).mapToInt(i->i).toArray();
    }
    public static int mirror(int n){
        String newstr=Integer.toBinaryString(n);
        String revofnewstr =new StringBuilder(newstr).reverse().toString();
        return Integer.parseInt(revofnewstr,2);
    }
}
