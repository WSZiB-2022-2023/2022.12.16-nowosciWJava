package pl.edu.wszib.nowosci.w.java.java14;

public class Main {
    public static void main(String[] args) {
        Object o = "ABC";
        if(o instanceof String) {
            String s = (String) o;
            System.out.println(s.toLowerCase());
        }

        Object o2 = "ABC";
        if(o instanceof String s) {
            System.out.println(s.toLowerCase());
        }

        CarRecord carRecord = new CarRecord("BMW", "3", 200);
        System.out.println(carRecord.brand());
        System.out.println(carRecord.model());
        System.out.println(carRecord.price());

        carRecord.a();

        CarRecord.a = 10;

        CarRecord carRecord2 = new CarRecord();
        System.out.println(carRecord2.brand());
        System.out.println(carRecord2.model());
        System.out.println(carRecord2.price());
    }
}
