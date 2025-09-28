package Tree;

public class ZigZagLtc103 {
    /*
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Deque<TreeNode> deque=new LinkedList<>();
        deque.offer(root);
        boolean reverse=false;
        while(!deque.isEmpty()){
            int levelSize=deque.size();
            List<Integer> list=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode cNode=deque.pollFirst();
                    list.add(cNode.val);
                    if(cNode.left!=null){
                        deque.addLast(cNode.left);
                    }
                    if(cNode.right!=null){
                        deque.addLast(cNode.right);
                    }
                }else{
                    TreeNode cNode=deque.pollLast();
                    list.add(cNode.val);
                    if(cNode.right!=null){
                        deque.addFirst(cNode.right);
                    }
                    if(cNode.left!=null){
                        deque.addFirst(cNode.left);
                    }
                }
            }
            result.add(list);
            reverse=!reverse;
        }
        return result;
    }
    */
}
