package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[]str=s.split("\\s+");
        return str[str.length-1].length();
    }
}
