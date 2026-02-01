package NeetCodeSheet.SlidingWindow;

public class BestTimeTOBuyAndSellAStock {
    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j])continue;
                max=Math.max(max,Math.abs(prices[i]-prices[j]));
            }
        }
        return max;
    }
}
