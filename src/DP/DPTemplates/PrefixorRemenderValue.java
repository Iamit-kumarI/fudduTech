package DP.DPTemplates;
/*
⭐ DP TEMPLATE 3 — Prefix DP (state depends only on remainder/value)
Used in:
subsequence divisible by K
number of subsequences with GCD = x
DP based on sum modul K
DP on XOR
DP on GCD differences
 */
public class PrefixorRemenderValue {
    /*
    //template
    dp[newState] += dp[oldState]

     */
    /*
    int MOD = 1_000_000_007;
    int[] dp = new int[K];
    for(int x : arr){
    int[] temp = dp.clone();
        for(int r=0; r<K; r++){
            int nr = (r + x) % K;
            temp[nr] = (temp[nr] + dp[r]) % MOD;
        }
        dp = temp;
    }
        // answer = dp[targetRemainder];
     */
}
