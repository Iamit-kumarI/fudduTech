package NeetCodeSheet.Stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class DailyTemprature {
    public static void main(String[] args) {
        int[]arr={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        //tle
//        return IntStream.range(0,n).map(i->IntStream.range(i+1,n)
//                .filter(j->temperatures[j]>temperatures[i]).findFirst()
//                .stream().map(j->j-i).findFirst().orElse(0))
//                .toArray();
        int[]ans=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int prev=stack.pop();
                ans[prev]=i-prev;
            }
            stack.push(i);
        }
        return ans;
    }
}
