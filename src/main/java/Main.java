import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        String aborigens = "jfhfhjd jfhfhjd jdhhosjid jdhhosjid fjdhfsjhfks fjdhfsjhfks " +
                "djnsdmkma dsfnp djngkmvxgk ko";

        String[] element = new String[1];

        System.out.println("Ваш словарь:");

        // Монада
        Arrays.stream(aborigens.split("\\s"))
                .sorted()
                .filter(x -> {
                    if (!x.equalsIgnoreCase(element[0])) {
                        element[0] = x;
                        return true;
                    }
                    return false;
                }).map(w -> w + " - это слово ещё неизвестно!")
                .forEach(System.out::println);

    }
}