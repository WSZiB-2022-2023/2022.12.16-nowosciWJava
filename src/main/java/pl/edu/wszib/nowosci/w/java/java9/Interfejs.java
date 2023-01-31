package pl.edu.wszib.nowosci.w.java.java9;

public interface Interfejs {

    void a();

    default int diff(int a, int b) {
        print(a);
        print(b);
        return a-b;
    }

    private void print(int a) {
        System.out.println(a);
    }
}
