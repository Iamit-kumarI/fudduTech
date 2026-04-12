package Tree.DFS;

import Tree.TreeNode;
/*
public class DiamerterOfATreeLTC543 extends TreeNode {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode node){
        if(node==null)return 0;
        int leftheight=height(node.left);
        int rightheight=height(node.right);

        int dia=leftheight+rightheight+1;
        diameter=Math.max(dia,diameter);
        return Math.max(height(node.left),height(node.right)+1);
    }
}
*/