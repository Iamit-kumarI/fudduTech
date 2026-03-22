package TwoPointerSlidingWIndow;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FruitesIntoBasket {
    public static void main(String[] args) {
        int[]arr={0,1,2,1};
        System.out.println(totalFruit(arr));
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap();
        int left=0,right=0,max=0,val=0;
        while(right<fruits.length){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.getOrDefault(fruits[right],1)+1);
            }else{
                map.put(fruits[right],1);
                while(map.size()==3){
                    map.put(fruits[left],map.get(fruits[left])-1);
                    if(map.get(fruits[left])==0)map.remove(fruits[left]);
                    left++;
                }
            }
            // if(map.size()<=2){
            int curSum = map.entrySet().stream().mapToInt(e ->e.getValue()).sum();
            if(curSum>max)max=curSum;
            // }
            right++;
        }
        return max;
    }
}
