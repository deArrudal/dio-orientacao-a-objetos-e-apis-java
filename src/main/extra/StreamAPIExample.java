package main.extra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Sort array by value.
        numbers.stream().sorted().forEach(System.out::println);

        // Sum all even numbers.
        System.out.println(numbers.stream().filter(n -> (n % 2 == 0)).reduce(0, (a, b) -> a + b));

        // Check if all entries are positive numbers.
        System.out.println(numbers.stream().allMatch(n -> n > 0));

        // Filter the odd numbers.
        numbers.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList()).forEach(System.out::println);

        // Average of entries greater than 5.
        System.out.println(numbers.stream().filter(n -> n > 5).mapToDouble(Integer::doubleValue).average().orElse(0.0));

        // Check if any entry is greater than 10.
        System.out.println(numbers.stream().allMatch(n -> n > 10));

        // Display the second greater number.
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList().get(1));
    }
}
