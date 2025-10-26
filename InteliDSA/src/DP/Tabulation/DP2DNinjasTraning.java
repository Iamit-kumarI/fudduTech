package DP.Tabulation;

import java.util.Arrays;

public class DP2DNinjasTraning {
    public static int ninjaTraining(int n, int [][]points) {
        int [][]dp=new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][1],points[0][0]);
        dp[0][3]=Math.max(points[0][1],Math.max(points[0][2],points[0][0]));

        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
                int totalMax=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        totalMax=Math.max(totalMax,points[day][task]+dp[day-1][task]);
                    }
                }
                dp[day][last]=totalMax;
            }
        }
        return dp[n-1][3];
        /*
        int [][]arr=new int[n][4];
//        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],-1);
        }
        return helper(n-1,3,points,arr);
    }
    public static int helper(int day,int last,int [][]points,int [][]dp){
        if(day==0){//base condition
            int totalMax=0;
            for(int task=0;task<3;task++){
                if(task!=last){// if task wan't done before
                    totalMax=Math.max(totalMax,points[0][task]);
                }
            }
            dp[0][last]=totalMax;
            return totalMax;
        }
        if(dp[day][last]!=-1)return dp[day][last];
        int totalMax=0;
        for(int task=0;task<3;task++){
            if(task!=last){// if task wan't done
                int point=points[day][task]+helper(day-1,task,points,dp);
                totalMax=Math.max(point,totalMax);
            }
        }
        return dp[day][last]=totalMax;
         */
    }
}

