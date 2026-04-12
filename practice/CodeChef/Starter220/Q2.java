package CodeChef.Starter220;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Set<Character> set=new HashSet<>();
            boolean found=false;
            int n=sc.nextInt();
            String s=sc.next();
            for(char c:s.toCharArray()){
                if(set.contains(c)) found=true;
                set.add(c);
            }
            System.out.println(found?"Yes":"No");
        }
    }
}
