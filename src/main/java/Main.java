import java.util.*;

public class Main {

    public static void main(String[] args) {

        String aborigens = "jfhfhjd jfhfhjd jdhhosjid jdhhosjid fjdhfsjhfks fjdhfsjhfks " +
                "djnsdmkma dsfnp djngkmvxgk ko";

        Set<String> repeat = new LinkedHashSet<>();
        String[] a = aborigens.split(" ");

        for ( String ss : a)
            repeat.add(ss);

        String newRepeat = repeat.toString()
                .replace("[","")
                .replace("]","")
                .replace(",","");

        System.out.println("Ваш словарь:");

        // Монада
        Arrays.stream(newRepeat.split("\\s"))
                .sorted()
                .map(w -> w + " - это слово ещё неизвестно!")
                .forEach(System.out::println);

    }
}