package Atcoder.ARC209;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String str=sc.next();
            System.out.println(helper(str));
        }
    }
    public static String helper(String str){
        int []freq=new int[26];
        for(char c:str.toCharArray())freq[c-'a']++;
        int dis=0;
        for(int val:freq)if(val>0)dis++;
        if(dis==1)return str;
        char[]arr= str.toCharArray();
        Arrays.sort(arr);
        if(dis==2){
            char a=0,b=0;
            int f=0,f1=0;
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    if(a==0){
                        a=(char) ('a'+i);
                        f=freq[i];
                    }else{
                        b=(char) ('a'+i);
                        f1=freq[i];
                    }
                }
                if(f==1)return a+arrange(b,f1)+"";
                if(f1==1)return b+arrange(a,f)+"";
                StringBuilder sb=new StringBuilder();
                if(f>f1){
                    if(f-1>0)sb.append(arrange(a,f-1)).append(b).append(a);
                }else{
                    if(f1-1>0)sb.append(arrange(b,f1-1)).append(a).append(b);
                }
                return sb.toString();
            }
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]!=arr[i-1]){
                    char temp=arr[i];
                    arr[i]=arr[1];
                    arr[1]=temp;
                }
            }
        }
        return new String(arr);
    }
    public static String arrange(char c,int len){
        char[]temp=new char[len];
        Arrays.fill(temp,c);
        return new String(temp);
    }
}
