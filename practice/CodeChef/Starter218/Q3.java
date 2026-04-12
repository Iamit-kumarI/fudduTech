package CodeChef.Starter218;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int count=0,ans=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1')count++;
                int total=i+1;
                if(count>total/2)ans++;
            }
            System.out.println(ans);
        }
    }
}
