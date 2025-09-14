package Trees.Implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        bt.papulate(inpt);
//        bt.display();
        bt.prettyDisplay();
    }
}
