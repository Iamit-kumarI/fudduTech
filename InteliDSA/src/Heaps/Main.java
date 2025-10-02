package Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        //implementing heaps
        Heap<Integer> heap=new Heap<>();
        heap.insert(4);
        heap.insert(2);
        heap.insert(3);
        heap.insert(0);
        heap.insert(5);
//        ArrayList list=heap.heapSort();
//        System.out.println(list);
        System.out.println(heap.remove());
    }
}
