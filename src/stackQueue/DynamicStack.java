package stackQueue;
//this will never be full
public class DynamicStack extends CStack {
    public DynamicStack() {
        super();//will call cstack constructor which takes no agrument call CStack(){...}
    }
    public DynamicStack(int size){
        super(size);//this will call CStack(int size){...};
    }
    /*
    * in dunamic stack the only diff is push means while inserting if size gets full
    * double the this case
    *
    * so now here we want to change the push method of the parent call so
    * @Override
    * */
    @Override
    public boolean push(int item) {
        if(this.isFull()){//we have to double the array size
            int[]temp=new int[data.length*2];//now copy pre items here
            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        //insert items if its not full
//        data[ptr]=item;
//        ptr+=1;
        return super.push(item);
    }
}
