package Tree.BT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree();
        Scanner inpt=new Scanner(System.in);
        tree.papulate(inpt);
        tree.display();
    }

//    public static void main(String[] args) {
//        int val=3;
//        int pow=4;
//        System.out.println(power(val,pow,val));
//        System.out.println(Math.pow(3,4));
//        String s="sdfjk";
//        System.out.println(s.st);
//    }
//    public static int power(int n,int m,int given){
//        if(m==1) return n;
//        return power(n*given,m-1,given);
//    }
}
