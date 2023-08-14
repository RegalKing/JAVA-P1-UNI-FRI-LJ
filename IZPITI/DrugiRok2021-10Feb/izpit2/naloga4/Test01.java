
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70));
        System.out.println(Cetrta.razmnozi(stevila, 3));
        System.out.println(Cetrta.razmnozi(stevila, 10));

        List<String> besede = new ArrayList<>(List.of("Ana", "Bojan", "Cvetka", "Dejan", "Eva", "Franci"));
        System.out.println(Cetrta.razmnozi(besede, 2));
        System.out.println(Cetrta.razmnozi(besede, 5));
    }
}
