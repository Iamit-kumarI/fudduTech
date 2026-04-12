package DP.DPTemplates;
/*
⭐ DP TEMPLATE 1 — Subsequence (take/skip)
Used in:
subsequence sum
count subsequences
LIS variations
any “choose elements in order” problem
🔥 Pattern:
At each index you decide: take or skip.
* */
public class SubsequenceTakeSkip {
    /*
    int solve(int i, State state){
        if(i == n) return baseCase(state);

        // skip current element
        int skip = solve(i+1, state);

        // take current element (if valid)
        State newState = update(state, arr[i]);
        int take = solve(i+1, newState);

        return combine(skip, take);
    }
    */

    /* Bottom Up Version
    for(int i=n-1; i>=0; i--){
    for(State state : allStates){
        dp[i][state] = combine(
            dp[i+1][state],                    // skip
            dp[i+1][updated(state, arr[i])]    // take
        );
    }
}
    * */

}
