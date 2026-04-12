package stackQueue;

public class CircularQueue {
    protected int []data;
    private static final int defaulSize=10;
    protected int end=0;
    protected int front=0;
    protected int size=0;
    public CircularQueue(){
        this(defaulSize);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end%=data.length;// that 5%5=0 concept
        size++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove=data[front++];
        front%= data.length;
        size--;
        return remove;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int index=front;//start printing from front
        do{
            System.out.print(data[index++]+" <-");
//            index+=1;
            index%=data.length;
        }while(index!=end);//till index not reach array's end
        System.out.println("TOP");
    }
}
