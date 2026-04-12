package Leetcode.Biweekly.BW175;

public class Q1 {
    public static void main(String[] args) {
        String str=")ebc#da@f(";
        System.out.println(reverseByType(str));
    }
    public static String reverseByType(String s) {
        char[]charArray=s.toCharArray();
        int low=0,end=charArray.length-1;
        while(low<end){
            if(!Character.isAlphabetic(charArray[low])){
                low++;
                continue;
            }
            if(!Character.isAlphabetic(charArray[end])){
                end--;
                continue;
            }
            char temp=charArray[low];
            charArray[low++]=charArray[end];
            charArray[end--]=temp;
        }
        low=0;
        end=charArray.length-1;
        while(low<end){
            if(Character.isAlphabetic(charArray[low])){
                low++;
                continue;
            }
            if(Character.isAlphabetic(charArray[end])){
                end--;
                continue;
            }
            char temp=charArray[low];
            charArray[low++]=charArray[end];
            charArray[end--]=temp;
        }
        return new String(charArray);
    }
}
