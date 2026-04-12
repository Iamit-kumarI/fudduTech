package DP.DPTemplates;
/*
⭐ DP TEMPLATE 6 — Interval DP
Used in:
matrix chain multiplication
burst balloons
palindrome partitioning
DP on subarrays
 */
public class IntervalDP {
    //template
    /*
    for(int len=1; len<=n; len++){
        for(int i=0; i+len-1 < n; i++){
            int j = i + len - 1;
            dp[i][j] = INF;
            for(int k=i; k<j; k++){
                dp[i][j] = min(dp[i][j],dp[i][k] + dp[k+1][j] + cost(i,j,k));
             }
        }
    }
     */
}
