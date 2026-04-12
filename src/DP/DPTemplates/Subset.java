package DP.DPTemplates;
/*
       ⭐ DP TEMPLATE 2 — Knapsack / Subset DP
    Used in:
subset sum
partition equal subset
count subsets
target sum
unbounded & 0/1 knapsack
 */
public class Subset {
    //🔥 0/1 Knapsack (each element used once):
    /*
    int[] dp = new int[W+1];
    for(int i=0; i<n; i++){
        for(int w=W; w>=weights[i]; w--){
            dp[w] = Math.max(dp[w], dp[w-weights[i]] + values[i]);
        }
    }
     */

    //🔥 Subset-sum boolean:
    /*
    boolean[] dp = new boolean[target+1];
    dp[0] = true;
    for(int num : arr){
        for(int s=target; s>=num; s--){
            dp[s] |= dp[s-num];
        }
    }
     */
}
