package Leetcode.Math;

public class POTD3577 {
    public int countPermutations(int[] complexity) {
        int m=(int)1e9+7;
        int ans=1;
        for(int i=1;i<complexity.length;i++){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
            ans=(ans*i)%m;
        }
        return ans;
    }
}
