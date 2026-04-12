package Leetcode.NQueen;

import java.util.ArrayList;
import java.util.List;

public class Ltc51 {
        public static void main(String[] args) {
            int n=4;
            //length of the maze
            boolean[][]board=new boolean[n][n];
            //calling queen
            System.out.println(queen(board,0));
        }
        static List<List<String>> queen(boolean[][]board,int r){
            if(r== board.length){
                List<String> outer=new ArrayList<>();
//                outer.add(p);
                for(boolean[] arr:board){
                    StringBuilder str=new StringBuilder();
                    for(boolean pos:arr){
                        str.append(pos?"Q":".");
                    }
                    outer.add(str.toString());

                }
                List<List<String>> result=new ArrayList<>();
                result.add(outer);
                return result;
            }
            List<List<String>> internal=new ArrayList<>() ;
            for(int c=0;c<board.length;c++){
                if(isSafe(board,r,c)){
                    board[r][c]=true;
//                    internal.addAll(queen(board,p+"Q",r+1));
                    internal.addAll(queen(board,  r + 1));
                    board[r][c]=false;
                }
            }
            return internal;
        }
        static boolean isSafe(boolean[][]board,int r,int c){
            //check vertical uses
            for (int i = 0; i < r; i++) {
                if(board[i][c]){
                    return false;
                }
            }
            //check diagonal left
            int maxLeft=Math.min(r,c);
            for(int i=1;i<=maxLeft;i++){
                if(board[r-i][c-i]){
                    return false;
                }
            }
            //diagonal right
            int maxRight=Math.min(r,board.length-c-1);
            for (int i = 1; i <=maxRight; i++) {
                if(board[r-i][c+i]){
                    return false;
                }
            }
            return true;
        }
}
