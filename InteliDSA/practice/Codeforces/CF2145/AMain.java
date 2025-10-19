package Codeforces.CF2145;

import java.util.*;
//notebook
public class AMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while (n-->0) {
            int a= sc.nextInt();
            int k= sc.nextInt();
            String str= sc.next();

            int lp = -k;
            int res = 0;

            for (int i = 0; i < a; i++) {
                if (str.charAt(i) == '1') {
                    if (i - lp >= k) {
                        res++;
                        lp = i;
                    } else {
                        lp = i;
                    }
                }
            }

            System.out.println(res);
        }
    }
}

