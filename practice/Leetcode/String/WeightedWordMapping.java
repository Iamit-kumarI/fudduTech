package Leetcode.String;

public class WeightedWordMapping {
    public static void main(String[] args) {
        String[]strArr={"abcd","def","xyz"};
        int[]arr={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(strArr,arr));
    }
    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        char[]charArr={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        for(String cur:words){
            int sum=-1;
            for(char c:cur.toCharArray()){
                sum+=weights[c-'a'];
            }
            int index=(sum+1)%26;
            sb.append(charArr[index]+"");
        }
        return sb.toString();
    }
}
