package pl.edu.wszib.nowosci.w.java.java12;

public class Main {
    public static void main(String[] args) {
        int i = 2;

        switch(i) {
            case 1:
            case 2:
                System.out.println("1 albo 2");
                break;
            case 3:
                System.out.println("to jest 3");
                break;
            case 4:
                System.out.println("to jest 4");
                break;
            default:
                System.out.println("nie wiadomo co to !!");
        }

        switch(i) {
            case 1,2 -> System.out.println("1 albo 2");
            case 3 -> System.out.println("to jest 3");
            case 4 -> System.out.println("to jest 4");
            default -> System.out.println("nie wiadomo co to !!");
        }

        String result = switch(i) {
            case 1,2 -> "1 albo 2";
            case 3 -> {
                String a = "Asdfasd";
                String b = "kjashgdlkj";
                yield a + " " + b;
            }
            case 4 -> "to jest 4";
            default -> "nie wiadomo co to !!";
        };

        //boolean x = i < 4 ? true : false;
    }
}
