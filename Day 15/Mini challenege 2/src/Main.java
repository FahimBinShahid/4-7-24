import java.util.Arrays;
import java.util.function.Function;
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
//            Arrays.asList(source).forEach(s-> System.out.println(s));
            return returnVal.toString();

        };

        System.out.println(everySecondChar.apply("1234567890"));


    }
    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
