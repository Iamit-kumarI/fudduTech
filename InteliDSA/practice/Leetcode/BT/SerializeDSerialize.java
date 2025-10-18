package Leetcode.BT;

import Tree.BT.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDSerialize extends TreeNode {
    public String serialize(TreeNode root) {
        if(root==null)return "";
        //BFS
        Queue<TreeNode>queue=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cnode=queue.poll();
            if(cnode==null){
                str.append("# ");
                continue;
            }
            str.append(cnode.val);
            queue.add(cnode.left);
            queue.add(cnode.right);
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null)return null;
        Queue<TreeNode>queue=new LinkedList<>();
        String[]strarray=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(strarray[0]));
        queue.add(root);
        int index=1;
        while(!queue.isEmpty()){
            TreeNode cnode=queue.poll();
            // "# " meanse next data item is null
            if(index<strarray.length && !strarray[index].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(strarray[index]));
                cnode.left=left;
                queue.add(left);
            }
            index+=1;
            if(index<strarray.length && !strarray[index].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(strarray[index]));
                cnode.right=right;
                queue.add(right);
            }
            index+=1;
        }
        return root;
    }
}
