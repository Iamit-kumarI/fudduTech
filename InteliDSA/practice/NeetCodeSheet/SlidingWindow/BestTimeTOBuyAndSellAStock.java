package NeetCodeSheet.SlidingWindow;

public class BestTimeTOBuyAndSellAStock {
    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int max=0,minPrice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price>minPrice){
                minPrice=price;
            }else{
                max=Math.max(max,price-minPrice);
            }
        }
        return max;
    }
}
