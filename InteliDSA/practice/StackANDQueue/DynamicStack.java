package StackANDQueue;

public class DynamicStack {
    //first in first out
    // insert(isFull size*2)
    // delete
    //display
    int start=0,end=0,size=5;
    int []arr=new int[size];
    public void push (int val){
        if(isFull()){
            //need to double the size and copy elements
            arr=doublesize(arr,size);
            //size updated to new arrays length
            size=arr.length;
        }
        arr[end++]=val;
    }
    private int [] doublesize(int []arr,int size){
        //double the size
        int []newarr=new int[size*2];
        //copy element to new array
        for(int i=0;i<size;i++){
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public void display(){
        if(isEmpty())return;
        for(int i=start;i<end;i++){
            System.out.print(arr[i]+" -> ");
        }
        System.out.println();
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println(" Can't pop from empty stack ");
            return -1;
        }
        int remove=arr[end-1];
        end--;
        return remove;
    }
    public boolean isEmpty(){
        return end==start;
    }
    public boolean isFull(){
        return end==arr.length;
    }

}