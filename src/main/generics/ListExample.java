package main.generics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // the default list allows to add any type of object.
        List defaultList = new ArrayList();
        defaultList.add("1st element");
        defaultList.add(10);

        for (Object object : defaultList) {
            String elString = object.toString();
            System.out.println(elString);
        }

        // using generic types, we can set a specific type of object.
        List<String> genericList = new ArrayList<>();
        genericList.add("1st element");
        genericList.add("2nd element");

        for (String element : genericList) {
            System.out.println(element);
        }
    }
}