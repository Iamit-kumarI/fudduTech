package Trees.BST;
/*
public class BstFromInPreOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
    public TreeNode buildtree(int[]preorder,int prestart,int preend,int [] inorder,int instart,int inend,HashMap<Integer,Integer> map){
        if(prestart>preend||instart>inend)return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inRoot=map.get(root.val);
        int numleft=inRoot-instart;
        root.left=buildtree(preorder,prestart+1,prestart+numleft,inorder,instart,inRoot-1,map);
        root.right=buildtree(preorder,prestart+1+numleft,preend,inorder,inRoot+1,inend,map);
        return root;
    }
}
 */