package NeetCodeSheet.SlidingWindow;

public class LongestSubStringWithAtLeaseKRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ababbc",2));
    }
    public static int longestSubstring(String s, int k) {
        int[]arr=new int[26];
        int max=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            if(grek(arr,k))max=Math.max(max,i+1);
        }
        return max;
    }
    public static boolean grek(int[]arr,int k){
        for(int val:arr){
            if(val==0)continue;
            if(val<k)return false;
        }
        return true;
    }
}
