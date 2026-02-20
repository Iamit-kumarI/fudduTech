package NeetCodeSheet.TwoPointer;

import java.util.Arrays;

public class TappingRainWaterI {
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int[]preMax=new int[height.length];
        int[]sufMax=new int[height.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            max=Math.max(height[i],max);
            preMax[i]=max;
        }
        max=Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(height[i],max);
            sufMax[i]=max;
        }
        int ans=0;
        for(int i=0;i<height.length;i++){
            if(height[i]<preMax[i]&&height[i]<sufMax[i]){
                ans+=Math.min(preMax[i],sufMax[i])-height[i];
            }
        }
        return ans;
    }
}
