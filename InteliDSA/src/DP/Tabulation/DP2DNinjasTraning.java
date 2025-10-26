package DP.Tabulation;

import java.util.Arrays;

public class DP2DNinjasTraning {
    public static int ninjaTraining(int n, int [][]points) {
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
    }
}

}
