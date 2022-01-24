package pl.camp.it.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*List<Integer> filteredNumbers = new ArrayList<>();

        for(Integer element : numbers) {
            if(element < 4) {
                filteredNumbers.add(element);
            }
        }

        System.out.println(filteredNumbers);*/

        List<String> filteredList = numbers.stream()
                .peek(x -> {
                    System.out.println("Przyszła liczba taka:");
                    System.out.println(x);
                })
                .filter(x -> x < 7)
                .filter(x -> x > 2)
                .map(x -> ""+x)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        int sum = numbers.stream().parallel()
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .reduce(0, (acc, element) -> acc + element);

        System.out.println(sum);
    }
}
