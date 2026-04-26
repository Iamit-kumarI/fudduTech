package Codeforces.Templates.MyTemplates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIO {
    BufferedReader br;
    StringTokenizer st;
    public FastIO(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    public String next() throws IOException{
        while(st==null || !st.hasMoreTokens()){
            st=new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    public int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    public long nextLong()throws IOException{
        return Long.parseLong(next());
    }
    public char nextChar()throws IOException{
        return next().charAt(0);
    }
    public double nextDouble()throws IOException{
        return Double.parseDouble(next());
    }
    public int[]readIntArray(int n)throws IOException{
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=nextInt();
        return arr;
    }
    public long[]readLongArray(int n)throws IOException{
        long[]arr=new long[n];
        for(int i=0;i<n;i++)arr[i]=nextLong();
        return arr;
    }
    public String[]readStringArray(int n)throws IOException{
        String[]arr=new String[n];
        for(int i=0;i<n;i++)arr[i]=next();
        return arr;
    }
}
