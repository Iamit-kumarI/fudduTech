package NeetCodeSheet.BinarySearch;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[]arr={3,6,7,11};
        System.out.println(minEatingSpeed(arr,8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int val:piles)if(val>max)max=val;
        return  1;
    }
}
