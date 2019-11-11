package hu.aensys.lambda;

import hu.aensys.lambda.logic.Data;
import hu.aensys.lambda.logic.DataLoader;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaMain {

    public static void main(String[] args) {


        final Collection<Data> dataCollection = DataLoader.downloadData();

        forEach(dataCollection);

        findMaxWeight(dataCollection);
        System.out.println();
        collect70Height(dataCollection);
        System.out.println();
        collectToMap(dataCollection);
        System.out.println();
        mapCollection(dataCollection);
        System.out.println();
        findFirst(dataCollection);


        ArrayList<Data> dataCollectionWithNullElements = new ArrayList<>(dataCollection);
        IntStream.range(0, 20)
                .forEach((i) -> dataCollectionWithNullElements.add(null));

        System.out.println();
        System.out.println();
        mission0(dataCollectionWithNullElements);
        System.out.println();
        System.out.println();
        mission1(dataCollection);
        System.out.println();
        System.out.println();
        mission2(dataCollection);
        System.out.println();
        System.out.println();
        mission3(dataCollection);
        System.out.println();
        System.out.println();
        mission4(dataCollection);


    }

    private static void forEach(final Collection<Data> dataCollection) {

        //FOR-EACH
        for (final Data data : dataCollection) {

        }

        dataCollection.forEach(data -> {
        });

    }


    private static void findMaxWeight(final Collection<Data> dataCollection) {
        Data maxData = null;
        for (final Data data : dataCollection) {
            if (maxData == null || maxData.getWeight() < data.getWeight()) {
                maxData = data;
            }
        }

        System.out.println("Max weight\t" + maxData);
        dataCollection.stream()
                .max((a, b) -> Math.round(a.getWeight() - b.getWeight()))
                .ifPresent(data -> System.out.println("Max weight\t" + data));
    }

    private static void collect70Height(final Collection<Data> dataCollection) {
        final ArrayList<Data> height70 = new ArrayList<>();
        for (final Data data : dataCollection) {
            if (Math.round(data.getHeight()) == 70) {
                height70.add(data);
            }
        }

        final List<Data> height70_2 = dataCollection.stream()
                .filter(data -> Math.round(data.getHeight()) == 70)
                .collect(Collectors.toList());

        System.out.println("Is the same?\t" + height70.equals(height70_2));
    }

    private static void collectToMap(final Collection<Data> dataCollection) {
        //convert the collection to a map where the key is the id and the value is the the data itself
        final HashMap<Integer, Data> dataMap = new HashMap<>();

        for (final Data data : dataCollection) {
            dataMap.put(data.getId(), data);
        }

        final Map<Integer, Data> dataMap_2 = dataCollection
                .stream()
                .collect(Collectors.toMap(Data::getId, Function.identity())); // .collect(Collectors.toMap(data -> data.getId(), data -> data))

        System.out.println("Is the same?\t" + dataMap.equals(dataMap_2));
    }


    private static void mapCollection(final Collection<Data> dataCollection) {
        Collection<Float> height = new ArrayList<>();
        for (final Data data : dataCollection) {
            height.add(data.getHeight());
        }

        List<Float> height_2 = dataCollection
                .stream()
                .map(Data::getHeight)
                .collect(Collectors.toList());

        System.out.println("Is the same?\t" + height.equals(height_2));

    }


    private static void findFirst(final Collection<Data> dataCollection) {

        Data first = null;
        for (final Data data : dataCollection) { //if we have a list we can get(0) but i think its ugly too.
            first = data;
            break;
        }

        if (null == first) {
            throw new IllegalStateException("No element in the given collection.");
        }


        final Data first_2 = dataCollection.stream()
                .findFirst() //findAny() ??
                .orElseThrow(() -> new IllegalStateException("No element in the given collection.")); //here we should return with the Optional


        System.out.println(first);
        System.out.println(first_2);


    }


    private static void mission0(final Collection<Data> dataCollection) {
        // filter out null elements
        Collection<Integer> result = Collections.emptyList();


        System.out.println("Mission 0\t" + result.size());
    }

    private static void mission1(final Collection<Data> dataCollection) {
        // collect weight between 70 and 100
        Collection<Integer> result = Collections.emptyList();


        System.out.println("Mission 1\t" + result.size());
    }

    private static void mission2(final Collection<Data> dataCollection) {
        // map the collection to weight and round it and collect without duplicated data(no repeat).
        Collection<Integer> result = Collections.emptyList();

        System.out.println("Mission 2\t" + result.size());
    }

    private static void mission3(final Collection<Data> dataCollection) {
        //create a map where key is the data.getId() and the value is the BMI value
        //BMI formula = weight/height^2
        Collection<Integer> result = Collections.emptyList();


        System.out.println("Mission 3\t" + result.size());
    }

    private static void mission4(final Collection<Data> dataCollection) {
        //collect the data to a map where the key is is the rounded height and the values are the weights
        Collection<Integer> result = Collections.emptyList();


        System.out.println("Mission 4\t" + result.size());
    }



}
