package String;
import java.util.*;


public class Temp {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();
        list.add("KD");
        list.add("Suman");
        list.add("Aditi");
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.add("Amit");
        }
        System.out.println(list);

    }
}
