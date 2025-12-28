package Sorting;

public class POTD1351 {
    public static void main(String[] args) {
        int[]arr={0,-3,-3,-3,-3};
        System.out.println(binaryCount(arr));
    }
    public int countNegatives(int[][] grid) {
//        int count=0;
//        for(int []row:grid){
//            for(int val:row)if(val<0)count++;
//        }
//        return count;
        int count=0;
        for(int []row:grid){
            count+=binaryCount(row);
        }
        return count;
    }
    public static int binaryCount(int[]arr){
        int count=0;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<0){
                count=Math.max(count,arr.length-mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return count;
    }
}
