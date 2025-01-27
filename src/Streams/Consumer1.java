package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(5);

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        Consumer<List<Integer>> listConsumer = x -> {
            for(int i :x){
                System.out.println(i);
            }
        };
        listConsumer.accept(list);
    }
}
