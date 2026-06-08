package Leetcode.BT;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTreeFromDescription {
    static public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val,TreeNode left,TreeNode right) {
          this.val=val;
          this.left=left;
          this.right=right;
      }
  }
    public static void main(String[] args) {
        int[][]arr={{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        System.out.println(createBinaryTree(arr).toString());
    }
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode>map=new HashMap<>();
        Map<Integer,Integer> root=new HashMap<>();
        for(int[]arr:descriptions){
            int parent=arr[0];
            int child=arr[1];
            boolean isLeft=arr[2]==1?true:false;
            if(!map.containsKey(parent)){
                map.put(parent,new TreeNode(parent));
            }
            if(!map.containsKey(child)){
                map.put(child,new TreeNode(child));
            }
            if(isLeft){
                map.get(parent).left=map.get(child);
            }else map.get(parent).right=map.get(child);
            if(root.getOrDefault(parent,0)!=-1){
                root.put(parent,1);
            }
            root.put(child,-1);
        }
        int rootValue=0;
        for(var entry:root.entrySet()){
            if(entry.getValue()==1){
                rootValue=entry.getKey();
                break;
            }
        }
        return map.get(rootValue);
    }
}
