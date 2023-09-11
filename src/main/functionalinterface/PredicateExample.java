package main.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Represents a predicate (boolean-valued function) of one argument. */

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> wordsWith5Char = palavra -> palavra.length() > 5;

        words.stream().filter(wordsWith5Char).forEach(System.out::println);
    }
}
