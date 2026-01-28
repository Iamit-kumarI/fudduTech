package NeetCodeSheet.TwoPointer;

public class TappingRainWater {
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int[]prefix=new int[height.length];
        int[]sufix=new int[height.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            prefix[i]=max;
        }
        max=Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            sufix[i]=max;
        }
        max=0;
        for(int i=0;i<height.length;i++){
            if(height[i]<prefix[i]&&height[i]<sufix[i]){
                max+=Math.min(prefix[i],sufix[i])-height[i];
            }
        }
        return max;
    }
}
