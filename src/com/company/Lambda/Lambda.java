package com.company.Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Lambda {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Наташа", Arrays.asList("Java", "C++"));
        Developer dev2 = new Developer("Эрнест", Arrays.asList("Java", "Python"));
        Developer dev3 = new Developer("Элла", Arrays.asList("С#", "Python", "JavaScript"));

        Stream<Developer> developerStream = Stream.of(dev1, dev2, dev3);
        Stream<Developer> developerStream1 = Stream.of(dev1, dev2, dev3);
        List<String> languages = developerStream
                .flatMap(developer -> developer.getLanguages().stream())
                .collect(Collectors.toList());
        Map<String, Long> counts =
                languages.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        developerStream1.filter(developer -> {
            for (String lang : developer.getLanguages()) {
                if (counts.get(lang) == 1) {
                    return true;
                }
            }
            return false;
        }).forEach(developer -> System.out.println(developer.getName()));


    }
}
