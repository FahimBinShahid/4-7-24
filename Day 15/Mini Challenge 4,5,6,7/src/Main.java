
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator <String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();

        };

        String result = everySecondCharacter(everySecondChar,"1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJavatoo = () -> {return "I love Java!";};

        System.out.println(iLoveJavatoo.get());
        System.out.println(iLoveJavatoo.get());

    }
    public static String everySecondCharacter(Function<String, String> func, String source){

        return func.apply(source);

    }
}
