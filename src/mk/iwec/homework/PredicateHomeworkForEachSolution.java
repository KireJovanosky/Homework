package mk.iwec.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateHomeworkForEachSolution {

    private static List<String> languages = new ArrayList<>();

    private static void filter (List<String> languages, Predicate<String> condition) {
        for (String e: languages) {
            if(condition.test(e)) {
                System.out.println(e);
            }
        }
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