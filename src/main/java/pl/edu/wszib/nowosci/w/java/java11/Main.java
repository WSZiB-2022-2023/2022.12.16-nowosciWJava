package pl.edu.wszib.nowosci.w.java.java11;

public class Main {
    public static void main(String[] args) {
        String s1 = " ";
        System.out.println(s1.isBlank());

        String toRepeat = "cos";
        String repeat = toRepeat.repeat(5);
        System.out.println(repeat);

        String toStrip = " ABC ";
        System.out.println(toStrip.strip());
        System.out.println(toStrip.stripLeading());
        System.out.println(toStrip.stripTrailing());

        //System.out.println(toStrip.trim());

        System.out.println("------------------------");

        String stringLinijkowy = "A\nB\nC\nD";

        System.out.println(stringLinijkowy);

        stringLinijkowy.lines()
                .filter(s -> !s.equals("B"))
                .forEach(System.out::println);
    }
}
