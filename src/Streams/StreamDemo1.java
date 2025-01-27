package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {

    // source , intermediate operation, terminal operation
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        int count = 0;
        for(int i:integerList){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(integerList.stream().filter(x -> x % 2 == 0).count());
    }
}
