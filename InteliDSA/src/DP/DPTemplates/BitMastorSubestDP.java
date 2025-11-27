package DP.DPTemplates;
/*
⭐ DP TEMPLATE 7 — Bitmask DP (subset DP)
Used in:
travelling salesman problem
DP on subsets
assignment problem
pick subset with restrictions
 */
public class BitMastorSubestDP {
    //template
    /*
    for(int mask=0; mask < (1<<n); mask++){
        for(int bit=0; bit<n; bit++){
            if((mask & (1<<bit)) != 0){
                dp[mask] = combine(dp[mask], dp[mask ^ (1<<bit)]);
            }
        }
    }
     */
}
