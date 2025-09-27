package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/binary-tree-right-side-view/solutions/7228262/java-beats-100-o-n
public class BTrightSideViewLtc199 extends TreeNode{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++){
                TreeNode cNode=queue.poll();
                if(i==levelsize-1)result.add(cNode.val);//each time adding last node only
                if(cNode.left!=null) queue.offer(cNode.left);
                if(cNode.right!=null)queue.offer(cNode.right);
            }
        }
        return result;
    }

}
