package DP.DPTemplates;
/*
⭐ DP TEMPLATE 5 — DP on Strings (LCS / Edit Distance)
Used in:
LCS
Edit distance
palindromic subsequence
longest palindromic subsequence
string matching
 */
public class DPonStringsorEditDistance {
    //LCS
    /*
    for(int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            if(A[i-1] == B[j-1])
                dp[i][j] = dp[i-1][j-1] + 1;
            else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
     */
    //Edit distance
    /*
    if(a[i-1]==b[j-1]) dp[i][j] = dp[i-1][j-1];
    else dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);

     */
}
