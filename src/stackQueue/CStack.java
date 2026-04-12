package stackQueue;

public class CStack {
    protected int [] data;
    private static final int Default_Size=10;
    //if no size is given use the default size
    int ptr=-1;
    public CStack(){
//        this.data=new int[Default_Size];
        //or we can do this lise
        this(Default_Size);
        //this will call the constracutor which takes only one argument and do the job
    }
    public CStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
//            throw new StackE("Stack is full Item "+item+" can't be inserted");
        }
        ptr+=1;
        data[ptr]=item;
        return true;
    }
    public int pop()throws StackE{
        if(isEmpty()) {
            throw new StackE("Can't pop from an Empty Stack");
        }
//        int removedItem=data[ptr];
//        ptr-=1;
//        return removedItem;
        return data[ptr--];//it return value at ptr index in data then decress the ptr
        //ptr-- after returning the value uty decress here or there no matter
    }
    public int peek()throws StackE{
        if(isEmpty()){
            throw new StackE("Stack if Empty");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;//false if pointer at last index
    }
    public boolean isEmpty(){
        return ptr==-1;//string is empty is pointer = to -1 it means its not started yet
    }
}

