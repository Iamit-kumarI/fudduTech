package DP.DPTemplates;
/*
⭐ DP TEMPLATE 8 — Digit DP
Used in:
count numbers with certain property from 1..N
no repeated digits, sum of digits, etc.
 */
public class DigitDP {
    //recursion template
    /*
    int solve(pos, tight, state){
        if(pos == digits.length) return valid(state);
        int limit = tight ? digits[pos] : 9;
        int ans = 0;
        for(int d=0; d <= limit; d++){
            ans += solve(pos+1,
                     tight && (d == limit),
                     update(state, d));
         }
         return ans;
     }
     */
}
