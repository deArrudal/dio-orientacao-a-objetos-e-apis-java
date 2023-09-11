package main.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* Represents a function that accepts one argument and produces a result. */

public class FunctionExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    Function<Integer, Integer> multiplyExample = x -> x * 2;

    List<Integer> numbersBy2 = numbers.stream().map(n -> n * 2).toList();

    numbersBy2.forEach(System.out::println);
  }
}