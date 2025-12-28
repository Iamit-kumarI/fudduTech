package Collection.LikedList;
import java.util.LinkedList;
public class Intro {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.remove(1);
        list.add(8);
        list.addFirst(2);
        list.addLast(10);
        list.set(4,31);
        System.out.println(list);
        list.removeIf(x->x%2==0);//remove if no is even
        System.out.println(list);
    }
}
