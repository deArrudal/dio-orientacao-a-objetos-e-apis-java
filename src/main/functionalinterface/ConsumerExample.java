package main.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* Represents an operation that accepts a single input argument and returns 
no result. Unlike most other functional interfaces, Consumer is expected 
to operate via side-effects. */

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printOddNumbers = x -> {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        };

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
