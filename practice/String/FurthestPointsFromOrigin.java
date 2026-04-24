package String;

public class FurthestPointsFromOrigin {
    public static void main(String[] args) {
        String s="L_RL__R";
        System.out.println(furthestDistanceFromOrigin(s));
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int under=0,left=0,right=0;
        for(char c:moves.toCharArray()){
            if(c=='_')under++;
            else if(c=='L')left++;
            else right++;
        }
        return Math.abs(right-left)+under;
    }
//        return helper(moves,0,0);
//    }
//    public static int helper(String moves,int index,int ans){
//        if(index==moves.length())return Math.abs(ans);
//        else if(moves.charAt(index)=='_'){
//            return Math.max(helper(moves,index+1,ans+1),helper(moves,index+1,ans-1));
//        }
//        else if(moves.charAt(index)=='L')return helper(moves,index+1,ans+1);
//        return helper(moves,index+1,ans-1);
//    }
}
