package main.functionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* Represents a supplier of results.
There is no requirement that a new or distinct result be returned each time the supplier is invoked.  */

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello, welcome!";

        List<String> loopMessage = Stream.generate(message).limit(5).toList();

        loopMessage.forEach(System.out::println);
    }
}
