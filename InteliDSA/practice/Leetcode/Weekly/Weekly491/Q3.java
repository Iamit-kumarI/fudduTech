package Leetcode.Weekly.Weekly491;

public class Q3 {
    public static void main(String[] args) {
        int[][]arr={
                {1,5},
                {2,4}
        };
        System.out.println(minimumOR(arr));
    }
    public static int minimumOR(int[][] grid) {
        int n=grid.length,ans=Integer.MAX_VALUE;
//        for(int bits=30;bits>=0;bits--){
//            int temp=ans|(1<<bits);
//            boolean pos=true;
//            for(int i=0;i<n;i++){
//                boolean found=false;
//                for(int num:grid[i]){
//                    if((num&temp)==0){
//                        found=true;
//                        break;
//                    }
//                }
//                if(!found){
//                    pos=false;
//                    break;
//                }
//            }
//            if(!pos){
//                ans|=(1<<bits);
//            }
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                ans=Math.min(ans,(grid[i][j]|grid[j][i])==0?ans:(grid[i][j]|grid[j][i]));
            }
        }
        return ans;
    }
}
