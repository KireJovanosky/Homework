package mk.iwec.homework;

import java.util.ArrayList;
import java.util.List;

public class PredicateHomeworkStreamSolution {

    private static List<String> languages = new ArrayList<>();

    public static void filter(List<String> languages, java.util.function.Predicate<String> condition) {
        languages.stream()
                .filter(condition)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        languages.add("Java");
        languages.add("Scala");
        languages.add("C++");
        languages.add("Delphy");
        languages.add("Pascal");


        System.out.println("Languages which start with J:");
        filter(languages, (l -> l.startsWith("J")));

        System.out.println("Languages which end with a:");
        filter(languages, (l -> l.endsWith("a")));

        System.out.println("Print all languages:");
        filter(languages, (l -> true));

        System.out.println("Print no language:\n");
        filter(languages, (l -> false));

        System.out.println("Print languages whose length is greater than 3:");
        filter(languages, (l -> l.length() > 3));



    }



}