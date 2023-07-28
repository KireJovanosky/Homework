package mk.iwec.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PredicateHomeworkStreamSolution {

    private static List<String> languages = Arrays.asList("Java","Scala", "C++", "Delphy", "Pascal");

    public static void filter(List<String> languages, java.util.function.Predicate<String> condition) {
        languages.stream()
                .filter(condition)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        int value;
        String letter;

        System.out.println("Please choose a filter by method:");
        System.out.println("To display all languages starting with chosen letter enter: - 1");
        System.out.println("To display all languages ending with chosen letter enter: - 2");
        System.out.println("To display all languages having more than given number of letters enter: - 3");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Please enter a letter: ");
                letter = scanner.next().toUpperCase();
                System.out.println("Languages which start with " + letter + ":");
                filter(languages, l -> l.startsWith(letter));
                break;
            case 2:
                System.out.println("Please enter a letter: ");
                letter = scanner.next().toLowerCase();
                System.out.println("Languages which end with " + letter + ":");
                filter(languages, l -> l.endsWith(letter));
                break;
            case 3:
                System.out.println("Please enter a number: ");
                value = scanner.nextInt();
                System.out.println("Languages which have more than " + value + " letters:");
                filter(languages, l -> l.length() > value);
                break;
            default:
                System.out.println("Please choose one of the given options!");
        }
        scanner.close();
    }
}