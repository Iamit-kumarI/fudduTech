package BitManupulation;

public class Ltc389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
    static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) result ^= c;
        for (char c : t.toCharArray()) result ^= c;
        return result;
    }

}
