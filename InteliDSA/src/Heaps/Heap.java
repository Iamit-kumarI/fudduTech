package Heaps;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{

    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int findex,int sindex){
        T temp=list.get(findex);
        list.set(findex,list.get(sindex));
        list.set(sindex,temp);
    }
    private int parent(int index){
        return (index-1)/2; // i/2 to get parent formula
    }
    private int left(int index){
        return (index*2)+1;// to get left child i*2 +1 formula
    }
    private int right(int index){
        return (index*2)+2;// to get right child i*2 +2 formula
    }
    public void insert(T value){
        list.add(value);
        /*
        * beforing inserting we will do add it to our list at end and then
        * do the operation of  min or max-heap upHeap method
        * */
        upHeap(list.size()-1);
    }
    private void upHeap(int index){
        if(index==0)return;
        int p=parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
        }
        upHeap(p);
    }
    public T remove()throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from empty heap not possible");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
        }
        //downheap to make it min or max heap
        downheap(0);
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);
        if(left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min=left;
        }
        if(right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        /*
        * if min which was erlier index is changed only then swap and call the recursive
        * recursive function to check other indexs as well if not chagnes means now
        * no need to go more it balances acc to min heap
        * */
        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }
    public ArrayList<T> heapSort() throws Exception{
        //BfS traversal of min heap gives sorted order of the list elements of heap
        ArrayList<T> data=new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
