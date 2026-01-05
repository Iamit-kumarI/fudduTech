package Collection.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        //taking output/result from stream
        List<Integer> list= Arrays.asList(2,3,4,4);

        //1. Collect
        Set<Integer> collectedSet = list.stream().skip(1).collect(Collectors.toSet());
        collectedSet.add(5);
        System.out.println(collectedSet);

        //2. forEach
        list.stream().forEach(x-> System.out.println(x+" "));

        //3. reduce : combines results to produce single result
//        Optional<Integer> reducedStrea = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> reducedStrea = list.stream().reduce(Integer::sum);//convreted lambda into stream working is still same
        System.out.println(reducedStrea.get().equals(13));//total sum is 13 so 13==13 right

        //4. count we have seen

        //5. anyMatch(), allMatch(), nonMatch()
        boolean countIsAnyElementInListIsEven = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(countIsAnyElementInListIsEven);

        boolean countIsAllElementsInListIsEven = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(countIsAllElementsInListIsEven);

        boolean noNegativeValue = list.stream().noneMatch(x -> x <0);
        System.out.println(noNegativeValue);//checks list dosen't have negative values

        //6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());//returns first element onlu
        System.out.println(list.stream().findAny().get());//return any element

        //7. min max
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list.stream().min((a,b)->b-a).get());

        //8. forEachOrder
        List<Integer>list1=Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("parallelStrem with forEach");
        list1.parallelStream().forEach(System.out::println);
        System.out.println("parallelStrem with forEachOrder");//things will parallelly but order will be maintained as well
        list1.parallelStream().forEachOrdered(System.out::println);
    }
}
