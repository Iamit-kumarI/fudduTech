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
        //change this +,-,* what ever you want it will return the ans in O(logN)
        node.data=node.left.data+node.right.data;//27 comes from 3 and 24 right see the case tree
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
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
    public int query(int qsi,int qei){
        /*
        * qsi:        query start index
        * qei:        query end index
        * */
        return this.query(root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        if(node.startInterval>=qsi&&node.endInterval<=qei){
            //4,5 case or 2,3 case
            //completely lying inside the query case need to return all the items
            return node.data;
        }else if(node.startInterval>qei||node.endInterval<qsi){
            //0,1 case 7,7 case
            //completely outside no nothing have
            return 0;
        }else{
            //if nothing satisfy means 2-6 may have 0-3 or 6-7 so need to make calls
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);//left for 0-3 right for 6-7
        }
    }
    public void update(int index,int value){
        update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
        if(index>=node.startInterval&&index<=node.endInterval){
            //workable case
            if(index==node.startInterval&&index==node.endInterval){
                //find the index to update
                node.data=value;
                return node.data;
            }else{//case have few 0-3 we want 2 so we have to go inside that case is for that
                int leftAns=update(node.left,index,value);
                int rightAns=update(node.right,index,value);
                node.data=leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;//the completely outside case
    }

}
