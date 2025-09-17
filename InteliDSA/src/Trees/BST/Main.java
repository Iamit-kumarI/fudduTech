package Trees.BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
//        int []nums={5,2,7,1,4,6,9,8,3,10};
        //take sorted array it wont get skewed O(N)
        int []nums={1,2,3,4,5,6,7,8,9,10};
//        bst.papulate(nums);
        bst.papulateSorted(nums);
        bst.display();
    }
}
