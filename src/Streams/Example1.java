package Streams;

import java.util.function.*;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(4,4));

        BiConsumer<Integer,String> biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String,String,Integer> biFunction = (x,y) -> (x + y).length();
        System.out.println(biFunction.apply("Hello","World"));
    }
}
