
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(2, 23, "pisarna"),
            new Cetrta.Prostor(2,  8, "WC"),
            new Cetrta.Prostor(2, 25, "pisarna"),
            new Cetrta.Prostor(1, 12, "WC"),
            new Cetrta.Prostor(3, 30, "pisarna"),
            new Cetrta.Prostor(2, 17, "kuhinja"),
            new Cetrta.Prostor(3, 15, "kopirnica"),
            new Cetrta.Prostor(2, 15, "kopirnica"),
            new Cetrta.Prostor(2, 20, "pisarna"),
            new Cetrta.Prostor(3, 17, "kuhinja"),
            new Cetrta.Prostor(3, 20, "pisarna"),
            new Cetrta.Prostor(1, 90, "dvorana"),
            new Cetrta.Prostor(3,  8, "WC")
        ));

        Map<Integer, Map<String, Integer>> statistika =
            Cetrta.statistika(prostori);

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
