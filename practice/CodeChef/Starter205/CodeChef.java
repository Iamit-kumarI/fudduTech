package CodeChef.Starter205;

import java.util.Scanner;

public class CodeChef {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner inpt=new Scanner(System.in);
        String str=inpt.next();
        if(str.length()>3||str.length()<3) System.out.println("No");
        if(str.length()==3&&str.charAt(1)=='w'&&str.charAt(0)==str.charAt(2)){
            System.out.println("Cute");
        }else{
            System.out.println("No");
        }

    }
}
