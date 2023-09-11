package main.generics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set defaultSet = new HashSet();
        defaultSet.add("1st element");
        defaultSet.add(10);

        for (Object element : defaultSet) {
            String elString = element.toString();
            System.out.println(elString);
        }

        //using generic types.
        Set<String> genericSet = new HashSet<>();
        genericSet.add("1st element");
        genericSet.add("2nd element");

        for (String element : genericSet) {
            System.out.println(element);
        }
    }
}
