package Recursion;

public class Dies {
    public static void main(String[] args) {
//        System.out.println();
        dice("",4);
    }
    static void dice(String p,int target){
        if (target <= 0) {
            System.out.print(p+',');
            return;
        }
        for (int i = 1; i < 6&&i<=target; i++) {
            dice(p+i,target-i);
        }
    }
}
