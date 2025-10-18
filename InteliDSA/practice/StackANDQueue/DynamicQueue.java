package StackANDQueue;

public class DynamicQueue {
    // here is the cat if FIFO
    // so we always have to delete from the start index 0
    // and tell the queue at index 0 is empty
    int start=0,end=0,size=0;
    int default_Size=5;
    int []arr=new int[default_Size];//initially 10 size
    public void offer(int val){
        //add at end no problem
        if(isFull()){
            //need to double the size
            arr=doublesize(arr,size);
        }
        arr[end++]=val;
        end%=arr.length;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.print("Can't pop from empty Queue ");
            return -1;
        }
        int remove=arr[start++];
        //after removing the element we can shift the elements ass well like this
        // arr[i-1]=arr[i] update the end=-1 and size=-1
        start%=arr.length;
        size--;
        return remove;
    }
    public int []doublesize(int []arr,int size){
        int []newarr=new int[size*2];
        //copy element
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[(start+i)%arr.length];
        }
        start=0;
        end=arr.length;
        return newarr;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return;
        }
        int index=start;
        do{
            System.out.print(arr[index++]+" <- ");
            index%=arr.length;
        }while(index!=end);
        System.out.print("Top ");
        System.out.println();
    }
    public boolean isFull(){
        return arr.length==size;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
