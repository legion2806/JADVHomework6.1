import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String aborigens = "jfhfhjd jdhhosjid fjdhfsjhfks djnsdmkma dsfnp djngkmvxgk ko";

        // Детерминированность
        Function<String, String[]> splitWords = string -> string.split("\\s");

        System.out.println("Ваш словарь:");

        // Монада
        Arrays.stream((splitWords.apply(aborigens)))
                .sorted()
                .map(w -> w + " - это слово ещё неизвестно!")
                .forEach(System.out::println);

    }
}