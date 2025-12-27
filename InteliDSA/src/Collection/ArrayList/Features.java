package Collection.ArrayList;

import java.util.*;

public class Features {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(4));
        list.remove(2);//80 will be removed
        list.add(11);
        list.add(14);
        list.add(3, 8);//after 2 index 8 will be added and 3 index element
        //will be shift to 4 note that it won't remove 3rd element
        list.set(3, 19);//node 3 index will be replaced with 19 it wont shift
        System.out.println(list);
        String[] stringArr = {"ab", "abc"};
        List<String> list1 = Arrays.asList(stringArr);//Arrays.asList()dosen't work perfectly with int arr
        // to make arr ans array list we just have to traverse over array and copy the elements into list
        // one more thing asList() this method return fixed size list means we can't add elements
        // in this only replace possible
        List<Integer> list2 = new ArrayList<>();
        list.addAll(list2);//this method allows us to add one list into another list
        // see list.remove(1) this will delet the element from 1st index but if we do this with
        //respect to string list like list.remove("apple") so this will delete the first occurence of
        //"apple" fron the list to achieve this with integer list we can do
        list.remove(Integer.valueOf(1));//now i will search 1 then remove
        // we can sort the list as well
        Collections.sort(list);
        list.sort(null);//this also sorts list
    }
}
