package LinkedList.Concept;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
//        for (int i = 0; i <= 5; i++) {
//            list.inserLast(i);
//        }
        list.inserFirst(1);
        list.inserFirst(2);
        list.inserFirst(3);
        list.inserFirst(4);
        list.inserFirst(5);//all this are being added to start at head
        list.inserLast(6);//this is added at last at
        list.inserIndex(0,5);
//        list.display();
//        System.out.println(list.deleteFirst()+" is deleted from the start");
//        list.display();
//        System.out.println(list.deleteLast()+" is deleted from the end");
//        list.display();
//        System.out.println(list.deleteFromIndex(2));
//        list.display();
//        int val=1;
//        System.out.println(list.searchByValue(val)==1?"found "+val:val+"  Dosen't exit");
//        list.display();
        list.insertRecursion(6,2);
        list.display();
    }
}
