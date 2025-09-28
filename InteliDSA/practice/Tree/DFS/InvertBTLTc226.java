package Tree.DFS;

import Tree.TreeNode;
/*
public class InvertBTLTc226 extends TreeNode {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        inverTree(root);
        return root;
    }
    public void inverTree(TreeNode node){
        if(node==null)return;
        TreeNode leftside=invertTree(node.left);
        TreeNode rightside=invertTree(node.right);
        node.left=rightside;
        node.right=leftside;
    }
}
 */