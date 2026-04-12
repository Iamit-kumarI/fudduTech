package OPPs.Intro.Concepts.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        int []temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        int remove=data[--size];
        return remove;
    }
    @Override
    public String toString(){
        return Arrays.toString(data)+"Size is "+size;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
        data[index]=val;
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
        CustomArrayList list=new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        //doing this to check if list is dubbling the size of not
        for (int i = 0; i <13 ; i++) {
            list.add(i);
        }
        System.out.println(list.get(1));
        System.out.println(list);
    }

}
