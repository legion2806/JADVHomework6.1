import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        String aborigens = "jfhfhjd jfhfhjd jdhhosjid jdhhosjid fjdhfsjhfks fjdhfsjhfks " +
                "djnsdmkma dsfnp djngkmvxgk ko";

        Set<String> toFilter = Set.of("jfhfhjd", "jdhhosjid", "fjdhfsjhfks");
        Set<String> seen = new HashSet<>();

        System.out.println("Ваш словарь:");

        // Монада
        Arrays.stream(aborigens.split("\\s"))
                .sorted()
                .filter(s -> !toFilter.contains(s) || seen.add(s))
                .map(w -> w + " - это слово ещё неизвестно!")
                .forEach(System.out::println);

    }
}