package pl.edu.wszib.nowosci.w.java.java10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println(integers);
        List<Integer> copyList = List.copyOf(integers);
        System.out.println(copyList);

        //copyList.add(8);

        List<String> strings = copyList.stream()
                .map(i -> i + "_STRING")
                .toList();

        System.out.println(strings);
        //strings.add("cos");
        System.out.println(strings);

        var a = "ABC";
        System.out.println(a);
        a = "XYZ";
        System.out.println(a);
        //a = 5;

    }
}
