package Leetcode.Biweekly.BW176;

public class Q1 {
    public static void main(String[] args) {
        String[]words={"abcd","def","xyz"};
        int[]arr={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,arr));
    }
    public static String mapWordWeights(String[] words, int[] weights) {
        int val=0;
        char[]arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder sb=new StringBuilder();
        for(String cur:words){
            for(char c:cur.toCharArray()){
                val+=weights[c-'a'];
            }
            sb.append(arr[25-(val%26)]);
            val=0;
        }
        return sb.toString();
    }
}
