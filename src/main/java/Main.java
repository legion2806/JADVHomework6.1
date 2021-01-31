import java.util.*;

public class Main {


    public static void main(String[] args) {

        String aborigens = "jfhfhjd jfhfhjd jdhhosjid jdhhosjid fjdhfsjhfks fjdhfsjhfks " +
                "djnsdmkma dsfnp djngkmvxgk ko";

        Arrays.stream(aborigens.split("\\s"))
                .sorted()
                .filter((x) -> {
                    if (x.equalsIgnoreCase("jfhfhjd") || x.equalsIgnoreCase("jdhhosjid")
                            || x.equalsIgnoreCase("fjdhfsjhfks")) {
                        System.out.println(x + " - это слово повторяеться");
                        return false;
                    }
                    return true;
                }).map(w -> w + " - это слово ещё неизвестно!")
                .forEach(System.out::println);

    }
}