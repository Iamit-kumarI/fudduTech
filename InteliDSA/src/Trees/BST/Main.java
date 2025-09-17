package Trees.BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        int []nums={5,2,7,1,4,6,9,8,3,10};
        bst.papulate(nums);
        bst.display();
    }
}
