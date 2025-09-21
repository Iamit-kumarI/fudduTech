package Trees.SegmentTree;
/*
*  why segment tree:            like suppose we are given an array and ask to find sum of all
*                                num in array or in a range so it will take O(N) right sum+=arr[i]
*                               which is O(N) 21 sep 2025
*                               sum+=arr[i] if o(N) not so good
* use cases:                    when we are asked to do something in a range sike sum of array or
*                               max of min or product of all no many like this we can do by segment
*                               tree in o(LogN) isntead of O(N)
* */
public class SegmentTree {
    private static class Node{
        int data,startInterval,endInterval;
        Node left,right;
        public Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;
    public SegmentTree(int []arr) {
        //arr have tree elements
        this.root=constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int []arr,int start,int end){
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        //create a node at the index your are at
        Node node=new Node(start,end);
        int mid=start+(end-start)/2;
        node.left=this.constructTree(arr,start,mid);
        /*left chain is being done here when reached the end of the left side or the arr 0-mid
        *so it will be retrun from where it was called then chain created
        *  */
        node.right=this.constructTree(arr,mid+1,end);
        node.data=node.left.data+node.right.data;//27 comes from 3 and 24 right see the case tree
        return node;
    }
    public void display(){
        display(this.root);
    } private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+" Interval ["+node.left.startInterval+" , "+node.left.endInterval+" ] data: "+node.left.data+" => ";
        }else{
            str+="No left child";
        }
        //for current node
        str=str+" Interval ["+node.startInterval+" , "+node.endInterval+" ] data: "+node.data+" <= ";

        if(node.right!=null){
            str=str+" Interval ["+node.right.startInterval+" , "+node.right.endInterval+" ] data: "+node.right.data+" => ";
        }else{
            str+="No right child";
        }
        System.out.println(str);
        //now just call recursion
        if(node.left!=null) display(node.left);
        if(node.right!=null)display(node.right);
    }

}
