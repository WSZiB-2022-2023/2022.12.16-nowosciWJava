package pl.edu.wszib.nowosci.w.java.java14;

public record CarRecord(String brand, String model, int price) {

    public static int a = 4;

    CarRecord() {
        this("ABC", "BAC", 324);
    }

    public void a() {
        System.out.println("metoda a !!!");
    }
}
