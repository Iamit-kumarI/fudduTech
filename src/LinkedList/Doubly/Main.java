package LinkedList.Doubly;

public class Main {
    public static void main(String[] args) {
//        DLLbyMe list=new DLLbyMe();
        DLLbyKunal list=new DLLbyKunal();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
//        System.out.println(list.tail.val);
        list.display();
//        list.displayReverse();
        list.inserLast(12);
        list.display();
//        list.displayReverse();//in order to work with reverse update tail
        list.inserAtValue(3,0);
        list.display();
    }
}
