package GfG.POTD;

public class SlidingWindow {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6};
        System.out.println(maxSubarrayXOR(arr,2));
    }
    public static int maxSubarrayXOR(int[] arr, int k) {
        int xor=0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)xor^=arr[i];
        max=xor;
        for(int i=k;i<arr.length;i++){
            xor^=arr[i]^arr[i-k];
            max=Math.max(xor,max);
        }
        return max;
    }
}
