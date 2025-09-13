package LinkedList.Circular;

public class Main {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println(list.delete(3));
        list.display();
    }
}
