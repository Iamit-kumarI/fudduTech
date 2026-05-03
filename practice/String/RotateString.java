package String;

import java.io.FilterOutputStream;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        return (s+s).contains(goal);
    }
}
