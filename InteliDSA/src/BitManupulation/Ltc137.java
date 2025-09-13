package BitManupulation;

public class Ltc137 {
    public static void main(String[] args) {
        int[] nums = {2,2,4,3,2,3,3};
        System.out.println(singleNum(nums));
    }
    static int singleNum(int []arr){
        return helper(arr,0,1);
    }
    static int helper(int []arr,int index,int sindex){
        if(index==arr.length) return -1;
        if(sindex==index)  return helper(arr,index,sindex+1);
        if(sindex<arr.length&&arr[index]==arr[sindex]){
            return helper(arr,index+1,0);
        }
        if(sindex==arr.length){
            return arr[index];
        }
        return helper(arr,index,sindex+1);
    }
}
