package stackQueue;

public class CustomQueue extends Exception{
    /*
    we can implement inseret from end where ptr is and del from the start where strt is
    but to make things complicated we are learning this one approach
     */
    private static final int default_size=10;
    private int[]data;

    int ptr=-1;
    int end=0;
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
//        end++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int remove=data[0];
        /*
        int tempvar=end;
        while(tempvar!=0){
            int temp=data[tempvar-1];
            data[tempvar-1]=data[tempvar];
            tempvar-=1;
        }*///how i written
        //best way
        for (int i = 1; i <= end; i++) {
            data[i-1]=data[i];
        }
        end-=1;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public CustomQueue(){//is size isn't given then
        this(default_size);
    }
    public CustomQueue(int size){//is size given then create a array of size given and assign it
        this.data=new int[size];//to the array data we have created
    }
}
