package Tree.DFS;

public class SymetricTreeLtc101 {
    /*
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levellen=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<levellen;i++){
                TreeNode cNode=queue.poll();
                if(cNode==null)list.add(null);
                else{
                    list.add(cNode.val);
                    queue.offer(cNode.left);
                    queue.offer(cNode.right);
                }
            }
            if(!isPalindrome(list))return false;
        }
        return true;
    }
    public boolean isPalindrome(List<Integer> list){
        int start=0,end=list.size()-1;
        while(start<end){
            if(list.get(start)==null&&list.get(end)==null){
                start++;
                end--;
                continue;
            }
            if(list.get(start)==null||list.get(end)==null)return false;
            if(!list.get(start).equals(list.get(end)))return false;
            start++;end--;
        }
        return true;
    }
}
*/
/*
//recursive approach
public boolean isSymmetric(TreeNode root) {
       if(root==null)return true;
       return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode nodeleft,TreeNode noderight){
        if(nodeleft==null&&noderight==null)return true;
        if(nodeleft==null||noderight==null)return false;
        return nodeleft.val==noderight.val && isMirror(nodeleft.left,noderight.right)&& isMirror(nodeleft.right,noderight.left);
    }
*/

}
