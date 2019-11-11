package hu.aensys.lambda;

import java.util.stream.Stream;

public class ExtraMain {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 1)
                .skip(4)
                .limit(10)
                .forEach(System.out::println);


        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(n -> n[0])
                .forEach(System.out::println);


       callMethod(() -> System.out.println("Hello"));
       callMethod(() ->{
           System.out.println("Hello");
           System.out.println("Hello");
       });
    }


    public static void callMethod(final Runnable runnable){
        runnable.run();;
    }
}
