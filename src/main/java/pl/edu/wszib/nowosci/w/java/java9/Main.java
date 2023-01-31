package pl.edu.wszib.nowosci.w.java.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(integers);

        //integers.add(10);

        List<Integer> mutableList = new ArrayList<>(integers);
        System.out.println(mutableList);

        mutableList.add(10);
        System.out.println(mutableList);

        Set<String> strings = Set.of("1", "2", "3", "4");
        System.out.println(strings);

        Map<Integer, String> map = Map.of(
                1, "V1",
                2, "V2",
                3, "V3"
        );

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "V1"),
                Map.entry(2, "V2"),
                Map.entry(3, "V3")
        );

        System.out.println(map);
        System.out.println(map2);

        mutableList.stream().takeWhile(i -> i < 4).forEach(System.out::println);
        System.out.println("-----------------");
        mutableList.stream().dropWhile(i -> i < 4).forEach(System.out::println);
    }
}
