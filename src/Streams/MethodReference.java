package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    // Use Method without invoking and is used in place of lambda expressions
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Bye", "Hi");
        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        //Constructor Reference
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> collect = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> collect1 = names.stream().map(MobilePhone::new).collect(Collectors.toList());

    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}