import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");

                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printThePartsLambda = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        printTheParts.accept("Let the array split");
        printThePartsLambda.accept("Let the array split");

        Consumer<String> printThePartsForEach = sd -> {
            String[] parts = sd.split(" ");
            Arrays.asList(parts).forEach(s-> System.out.println(s));
        };
        printThePartsForEach.accept("Let the array split");

        Consumer<String> printThePartsConciese = sd -> {
            Arrays.asList(sd.split(" ")).forEach(s-> System.out.println(s));
        };
        printThePartsConciese.accept("Let the array split");
    }
}
