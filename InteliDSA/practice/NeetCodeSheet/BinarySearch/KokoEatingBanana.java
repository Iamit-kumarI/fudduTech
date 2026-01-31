package NeetCodeSheet.BinarySearch;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[]arr={3,6,7,11};
        System.out.println(minEatingSpeed(arr,8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int val:piles)if(val>max)max=val;
        int start=1,end=max;
        int ans=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int total=calculateTotalHoursAtMidSpeed(piles,mid);
            if(total<=h){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
    public static int calculateTotalHoursAtMidSpeed(int[]arr,int speed){
        int totalHour=0;
        for(int banana:arr){
            totalHour+=(banana+speed-1)/speed;
        }
        return totalHour;
    }
}
