package stackQueue;

public class DynamicCircularQueue extends CircularQueue {
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }
    /*
    * Goral here is when we find our if(isfull()) return true
    * so insted of doing that we have to do size*=2 and
    * copy the all items of last queue and then assisn it to the
    * data Queue
    */
//    public boolean insert(int item){
//        if(isFull()){
//            //create double size array
//            int []arr=new int[data.length*2];
//            //copy the item
//            int index=front;
//            do{
//                arr[index]=data[index++];
//                index%=data.length;
//            }while(index!=end);
//            data=arr;
//        }
//        data[end++]=item;
//        end%=data.length;
//        size++;
//        return true;
//    }
    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int []temp=new int[data.length*2];
            for(int i =0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front =0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }
}
