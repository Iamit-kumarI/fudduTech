package Leetcode.Weekly.Weekly480;

public class Q3 {//not accepted
    public long minMoves(int[] balance) {
        int n=balance.length,sum=0;
        for(int val:balance)sum+=val;
        if(sum<0)return -1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(balance[i]<0){
                index=i;
                break;
            }
        }
        if(index==-1)return 0;
        long moves=0,carry=0;
        for(int i=0;i<n;i++){
            int curIndex=(index+1+i)%n;
            carry+=balance[curIndex];
            moves+=Math.abs(carry);
        }
        return moves;
    }
}
