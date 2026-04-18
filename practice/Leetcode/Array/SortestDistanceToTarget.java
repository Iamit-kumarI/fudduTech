package Leetcode.Array;

public class SortestDistanceToTarget {
    public static void main(String[] args) {
        String[]arr={"hello","i","am","leetcode","hello"};
        System.out.println(closestTarget(arr,"hello",1));
    }
    public static int closestTarget(String[] words, String target, int startIndex) {
        int ans=Integer.MAX_VALUE;
        int i=startIndex,j=startIndex,count=0,n=words.length;
        while(count<words.length){
            if(words[i].equals(target)){
                ans=Math.min(ans,Math.min(Math.abs(i-startIndex),n-Math.abs(i-startIndex)));
            }
            if(words[j].equals(target)){
                ans=Math.min(ans,Math.min(Math.abs(j-startIndex),n-Math.abs(j-startIndex)));
            }
            j++;
            i=i-1+n;
            j%=n;
            i%=n;
            count++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
