package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal102 {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> clist=new ArrayList<>(levelSize);

            for(int i=0;i<levelSize;i++){
                TreeNode cNode=queue.poll();
                clist.add(cNode.val);
                if(cNode.left!=null){
                    queue.offer(cNode.left);
                }
                if(cNode.right!=null){
                    queue.offer(cNode.left);
                }
            }
            result.add(clist);
        }

        return result;
    }
}
