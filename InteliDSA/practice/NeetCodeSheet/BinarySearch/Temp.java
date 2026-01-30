package NeetCodeSheet.BinarySearch;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Temp {
    public static void main(String[] args) {
        print_divisors(36);
    }
    public static void print_divisors(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.print(1+" ");
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                list.add(n/i);
            }
        }
        list.stream().sorted().forEach(x-> System.out.print(x+" "));
    }
}
