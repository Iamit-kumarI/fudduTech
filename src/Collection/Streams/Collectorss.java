package Collection.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Collectorss {
    public static void main(String[] args) {
        //Collectors is a utility class
        //provides us a set of method to create common collectors
        //1. List
        List<String> list= Arrays.asList("Alice","Bob","Charlie","Akshay");
        List<String> stringsStartsWithA = list.stream().filter(name -> name.startsWith("A")).toList();

        //2. Set
        Set<String> collectedIntoSet = list.stream().filter(name -> name.endsWith("e")).collect(Collectors.toSet());
        System.out.println(collectedIntoSet);

        //3. Collecting into a CUSTOM collection
        ArrayDeque<String> customeCollection = list.stream().filter(name -> name.length()>2).collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(customeCollection.peek());//now we can perform all queue operations

        //4. joining strings
        //concatinate steream element into a single elemetn
        String JoinedString = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(JoinedString);

        //5. Summarizing data
        //Generates stastical summary(sum, avg, min, max, count)
        List<Integer>list2=Arrays.asList(1,2,3,4,5,6,7);
        IntSummaryStatistics stats = list2.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("No of elements: "+stats.getCount());
        System.out.println("Avg: "+stats.getAverage());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());
        //___________________________________ OR __________________________________________
        Double average = list2.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Avg: "+average);

        //8. Grouping Elements
        List<String>list3=Arrays.asList("Hello","World","Java","Stream","Collectors");
        Map<Integer, List<String>> mappedBasedOnLen = list3.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(mappedBasedOnLen);
        //not making then again in list convert into string just joing
        System.out.println(list3.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
        //counting elemts of that length
        System.out.println(list3.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        TreeMap<Integer, Long> collectedIntoTreeMap = list3.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collectedIntoTreeMap);

        //9. Partioning Element
        //partion element based on predicate(true,false) asa
        System.out.println(list3.stream().collect(Collectors.partitioningBy(x->x.length()>5)));

        //10. Mapping and Collecting
        //applied mapping function before collecting
        System.out.println(list3.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));
        System.out.println(list3.stream().map(String::toUpperCase).toList());//better way

        //11. toMap
        //seems very usefull
        List<String> list4 = Arrays.asList("Apple", "Banana", "Cherry");
        //task length to its key
        System.out.println(list4.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length())));

        //12 toMap with merge
        //suppose we have duplicate key's so how to create map them like this
        List<String> list5 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(list5.stream().collect(Collectors.toMap(x->x,v->1,(x,y)->x+y)));
        //what we have done first
            // x -> x as came leve as it is
            // it its first apperence put 1
            // if its dplicate then do x+y last value plus 1
    }
}
