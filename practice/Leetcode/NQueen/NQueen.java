package Leetcode.NQueen;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        //length of the maze
        boolean[][]board=new boolean[n][n];
        //calling queen
        System.out.println(queen(board,0));
    }
    static int queen(boolean[][]board,int r){
        //when reach end print it and add a new line and go out by returning
        if(r== board.length){
            //printing the maze before marking is false
            posdisplay(board);
            System.out.println();
            return 1;
        }
        //count is the no how many timew we can place the queen in the maze
        int count=0;
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                //while going make as true
                board[r][c]=true;
                count+=queen(board,r+1);
                //while returning mark it false like it was never visitied
                board[r][c]=false;
            }
        }
        return count;
    }
    //is safe is the funciton which finds if the position is safe to place QUEEN or not
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
    static void posdisplay(boolean[][]board){
        //printing the matrix ont he bases of true and false as it was mark befoer marking
        // it true
        for(boolean[]arr:board){
            for(boolean position:arr){
                if(position){
                    System.out.print('Q');
                }else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
}
