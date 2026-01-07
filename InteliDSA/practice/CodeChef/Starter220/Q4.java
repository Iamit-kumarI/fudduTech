package CodeChef.Starter220;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n];
            int[]b=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            int top=Math.min(a[0],b[0]);
            int bottom=Math.max(a[0],b[0]);
            boolean found=true;
            for(int i=1;i<n;i++){
                int x=a[i],y=b[i];
                int ntop=Math.min(x,top);
                int nbottom=Math.max(y,bottom);
                if(ntop>=top&&nbottom>=bottom){
                    top=ntop;
                    bottom=nbottom;
                }else if(Math.max(x,y)>=top&&Math.min(x,y)>=bottom){
                    top=Math.max(x,y);
                    bottom=Math.min(x,y);
                }else{
                    found=false;
                    break;
                }
            }

            System.out.println(found?"Yes":"No");
        }
    }
}
