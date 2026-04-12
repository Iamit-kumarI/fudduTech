package Codeforces.R800;

import Codeforces.Templates.MyTemplates.FastIO;

import java.io.IOException;
import java.util.Arrays;

public class YesOrYes {
    public static void main(String[] args) throws IOException {
        FastIO sc=new FastIO();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=sc.readIntArray(n);
            System.out.println(Arrays.toString(arr));
        }

    }
}
