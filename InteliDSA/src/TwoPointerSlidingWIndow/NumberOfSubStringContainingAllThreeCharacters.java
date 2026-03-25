package TwoPointerSlidingWIndow;

public class NumberOfSubStringContainingAllThreeCharacters {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    public static int numberOfSubstrings(String s) {
        int[]lastChar={-1,-1,-1};
        int ans=0;
        for(int i=0;i<s.length();i++){
            lastChar[s.charAt(i)-'a']=i;
            ans+=1+Math.min(lastChar[0],Math.min(lastChar[1],lastChar[2]));
        }
        return ans;
    }
}
