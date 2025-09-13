package OPPs.Intro.Concepts.Generics;

import java.util.Arrays;

public class CustomGeneericArrayList<T>  { //this Object is generic

        private Object[]data;
        private static int DEFAULT_SIZE=10;
        private int size=0;

        public CustomGeneericArrayList(){
            this.data=new Object[DEFAULT_SIZE];
        }
        public void add(T num){
            if(isFull()){
                resize();
            }
            data[size++]=num;
        }

        private void resize() {
            Object[]temp=new Object[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        private boolean isFull() {
            return size==data.length;
        }
        public T remove(){
            T remove=(T)data[--size];
            return remove;
        }
        public T get(int index){
            return (T)data[index];
        }
        public int size(){
            return size;
        }
        public void set(int index,T val){
            data[index]=val;
        }
        @Override
        public String toString(){
            return Arrays.toString(data)+" :- Size "+size;
        }

    public static void main(String[] args) {
        CustomGeneericArrayList<Integer> glist=new CustomGeneericArrayList<>();
        glist.add(8);
//        glist.add("Hi");//giving an error becz in Integer we can add int type values
        glist.add(10);
        System.out.println(glist.get(0));
        for (int i = 0; i < 13; i++) {
            glist.add(i);
        }
        System.out.println(glist);
    }


}
