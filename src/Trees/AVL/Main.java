package Trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVL tree=new AVL();
        for(int i=0;i<15;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
