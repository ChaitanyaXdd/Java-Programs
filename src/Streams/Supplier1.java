package Streams;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get());
    }
}
