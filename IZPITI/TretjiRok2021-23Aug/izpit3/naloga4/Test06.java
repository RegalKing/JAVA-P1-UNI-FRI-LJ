
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(4, 84, "bba"),
            new Cetrta.Prostor(3, 98, "aaa"),
            new Cetrta.Prostor(3, 100, "bbb"),
            new Cetrta.Prostor(3, 1, "bbb"),
            new Cetrta.Prostor(1, 48, "bbb"),
            new Cetrta.Prostor(2, 33, "bb"),
            new Cetrta.Prostor(3, 51, "bba"),
            new Cetrta.Prostor(4, 65, "aaa"),
            new Cetrta.Prostor(4, 80, "bba"),
            new Cetrta.Prostor(2, 40, "aaaba"),
            new Cetrta.Prostor(1, 99, "aabab"),
            new Cetrta.Prostor(2, 53, "aaa"),
            new Cetrta.Prostor(2, 22, "aaa"),
            new Cetrta.Prostor(4, 2, "bba"),
            new Cetrta.Prostor(1, 98, "aabab"),
            new Cetrta.Prostor(1, 9, "aaa"),
            new Cetrta.Prostor(4, 35, "aaa"),
            new Cetrta.Prostor(1, 3, "bbb"),
            new Cetrta.Prostor(3, 25, "bb"),
            new Cetrta.Prostor(4, 45, "bba"),
            new Cetrta.Prostor(4, 10, "bba"),
            new Cetrta.Prostor(4, 62, "aaa"),
            new Cetrta.Prostor(3, 36, "bb"),
            new Cetrta.Prostor(4, 86, "aaaba"),
            new Cetrta.Prostor(4, 100, "bba"),
            new Cetrta.Prostor(2, 50, "aabab"),
            new Cetrta.Prostor(1, 2, "bb"),
            new Cetrta.Prostor(2, 33, "bbb"),
            new Cetrta.Prostor(2, 9, "bbb"),
            new Cetrta.Prostor(3, 8, "aaa"),
            new Cetrta.Prostor(3, 63, "aaa"),
            new Cetrta.Prostor(1, 16, "aaaba"),
            new Cetrta.Prostor(4, 20, "bba"),
            new Cetrta.Prostor(3, 91, "bb"),
            new Cetrta.Prostor(3, 87, "aaaba"),
            new Cetrta.Prostor(3, 72, "bba"),
            new Cetrta.Prostor(3, 1, "aaa"),
            new Cetrta.Prostor(4, 11, "aabab"),
            new Cetrta.Prostor(1, 48, "aaa"),
            new Cetrta.Prostor(3, 9, "aabab"),
            new Cetrta.Prostor(1, 52, "aaaba"),
            new Cetrta.Prostor(3, 27, "bba"),
            new Cetrta.Prostor(4, 96, "aaa"),
            new Cetrta.Prostor(4, 17, "bbb"),
            new Cetrta.Prostor(1, 98, "bba"),
            new Cetrta.Prostor(1, 23, "aabab"),
            new Cetrta.Prostor(3, 92, "bb"),
            new Cetrta.Prostor(4, 26, "bb"),
            new Cetrta.Prostor(3, 58, "bbb"),
            new Cetrta.Prostor(3, 63, "aaa"),
            new Cetrta.Prostor(2, 38, "bba"),
            new Cetrta.Prostor(4, 16, "aaa"),
            new Cetrta.Prostor(2, 71, "bb"),
            new Cetrta.Prostor(4, 42, "bb"),
            new Cetrta.Prostor(4, 78, "bbb"),
            new Cetrta.Prostor(1, 54, "aaaba"),
            new Cetrta.Prostor(2, 24, "bba"),
            new Cetrta.Prostor(1, 22, "aabab"),
            new Cetrta.Prostor(1, 82, "aabab"),
            new Cetrta.Prostor(2, 67, "aaa"),
            new Cetrta.Prostor(3, 79, "aabab"),
            new Cetrta.Prostor(2, 40, "bba"),
            new Cetrta.Prostor(3, 93, "aaa"),
            new Cetrta.Prostor(2, 61, "bba"),
            new Cetrta.Prostor(3, 5, "aaaba"),
            new Cetrta.Prostor(3, 67, "bb"),
            new Cetrta.Prostor(4, 18, "bba"),
            new Cetrta.Prostor(4, 75, "aaa"),
            new Cetrta.Prostor(2, 26, "aaaba"),
            new Cetrta.Prostor(1, 63, "aabab"),
            new Cetrta.Prostor(4, 13, "aabab"),
            new Cetrta.Prostor(4, 90, "aabab"),
            new Cetrta.Prostor(4, 17, "bba"),
            new Cetrta.Prostor(3, 37, "bb"),
            new Cetrta.Prostor(1, 80, "aaa"),
            new Cetrta.Prostor(4, 23, "aaaba"),
            new Cetrta.Prostor(4, 14, "bb"),
            new Cetrta.Prostor(4, 67, "bbb"),
            new Cetrta.Prostor(3, 75, "aaaba"),
            new Cetrta.Prostor(1, 36, "aabab"),
            new Cetrta.Prostor(2, 25, "aaa"),
            new Cetrta.Prostor(3, 94, "bbb"),
            new Cetrta.Prostor(1, 84, "aabab"),
            new Cetrta.Prostor(3, 93, "bba"),
            new Cetrta.Prostor(1, 57, "aaaba"),
            new Cetrta.Prostor(1, 43, "bb"),
            new Cetrta.Prostor(4, 1, "aaa"),
            new Cetrta.Prostor(3, 11, "aaa"),
            new Cetrta.Prostor(2, 57, "bbb"),
            new Cetrta.Prostor(3, 98, "bba"),
            new Cetrta.Prostor(1, 4, "aaa"),
            new Cetrta.Prostor(2, 69, "bba"),
            new Cetrta.Prostor(3, 40, "bb"),
            new Cetrta.Prostor(4, 82, "aaaba"),
            new Cetrta.Prostor(3, 90, "bb")
        ));

        Map<Integer, Map<String, Integer>> statistika = Cetrta.statistika(prostori);
        List<Integer> nadstropja = new ArrayList<>(statistika.keySet());
        nadstropja.sort(null);

        for (int nadstropje: nadstropja) {
            Map<String, Integer> n2p = statistika.get(nadstropje);
            if (n2p != null) {
                List<String> namembnosti = new ArrayList<>(n2p.keySet());
                namembnosti.sort(null);
                for (String namembnost: namembnosti) {
                    System.out.printf("(%d, %s): %d%n",
                    nadstropje, namembnost, n2p.get(namembnost));
                }
            }
        }
    }
}
