package Leetcode.Weekly.Weekly480;

public class Q2 {
    public String reverseWords(String s) {//3 wrong submissions
        String []stringArray=s.trim().split("\\s+");
        int vowels= noOfVowels(stringArray[0]);
        StringBuilder ans=new StringBuilder();
        StringBuilder tempSb=new StringBuilder();
        ans.append(stringArray[0]);
        for(int i=1;i<stringArray.length;i++){
            ans.append(" ");
            String current=stringArray[i];
            if(noOfVowels(current)==vowels){
                tempSb.append(current);
                ans.append(tempSb.reverse());
                tempSb.setLength(0);
            }else{
                ans.append(current);
            }
        }
        return ans.toString();
    }
    public static int noOfVowels(String str){
        int count=0;
        for(char c:str.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}
