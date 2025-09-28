//package Tree;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class CoursinLtc993 extends TreeNode {
//    public boolean isCousins(TreeNode root, int x, int y) {
//        Boolean status=false;
//        if(root==null)return status;
//        Queue<TreeNode> queue=new LinkedList<>();
//        HashMap<Integer,Integer> map=new HashMap<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int levelsize=queue.size();
//            HashMap<Integer,Integer> map=new HashMap<>();
//            for(int i=0;i<levelsize;i++){
//                TreeNode cNode=queue.poll();
//                if(cNode.left!=null){
//                    queue.offer(cNode.left);
//                    map.put(cNode.left.val,cNode);
//                }
//                if(cNode.right!=null){
//                    queue.offer(cNode.right);
//                    map.put(cNode.right.val,cNode);
//                }
//            }
//            if(map.containsKey(x)&&map.containsKey(y)){
//                return map.get(x)!=map.get(y);//if not from same parent then true
//            }
//        }
//        return status;
//    }
//}
