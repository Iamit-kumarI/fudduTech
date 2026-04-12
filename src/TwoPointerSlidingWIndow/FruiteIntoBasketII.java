package TwoPointerSlidingWIndow;

public class FruiteIntoBasketII {
    public static void main(String[] args) {
        int[]arrf={4,2,5};
        int[]arrb={3,5,4};
        System.out.println(numOfUnplacedFruits(arrf,arrb));
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int[]visted=new int[n];
        for(int i=0;i<n;i++){
            if(visted[i]==0){
                int valueInBacket=findIndex(baskets,fruits[i]);
                if(valueInBacket!=-1){
                    baskets[valueInBacket]=-1;
                    visted[i]++;
                }
            }
        }
        int ans=0;
        for(int val:visted){
            if(val==0)ans++;
        }
        return ans;
    }
    public static int findIndex(int[]arr,int val){
        for(int i=0;i<arr.length;i++){
            if(val!=-1&&arr[i]>=val)return i;
        }
        return -1;
    }
}
