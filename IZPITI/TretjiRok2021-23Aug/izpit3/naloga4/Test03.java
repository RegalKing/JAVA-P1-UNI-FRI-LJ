
import java.util.*;

public class Test03 {

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

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
