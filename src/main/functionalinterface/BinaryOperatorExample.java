package main.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/* Represents an operation upon two operands of the same type, producing a result of
the same type as the operands. */

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> sumExample = Integer::sum;

        int answer = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Sum: " + answer);
    }
}
