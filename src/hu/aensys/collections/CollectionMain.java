package hu.aensys.collections;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {


        Collection<Integer> diamondOperator = new ArrayList<>();

        //Don't do this
        List<Integer>  emptyIntegerList = Collections.EMPTY_LIST;
        //Do this
        List<Integer> emptyIntegerList2 = Collections.emptyList();

        // unmodifiable list
        List<String> stringList = new ArrayList<>();
        stringList.add("j");
        stringList.add("a");
        stringList.add("v");
        stringList.add("a");
        List<String> unmodifiableList = Collections.unmodifiableList(stringList); //what is this warning?

        //synchronized
        List<Double> doubleListSync = Collections.synchronizedList(new LinkedList<>());

        // is it ok?
//        Iterator<Double> iterator = doubleListSync.iterator();
//        doubleListSync.add(213.0d);
//        iterator.next();

    }
}
