
import java.util.*;

public class Cetrta {

    public static class Prostor {
        private int nadstropje;
        private int kvadratura;
        private String namembnost;

        public Prostor(int nadstropje, int kvadratura, String namembnost) {
            this.nadstropje = nadstropje;
            this.kvadratura = kvadratura;
            this.namembnost = namembnost;
        }

        @Override
        public String toString() {
            return String.format("%d. nadstropje / %s m^2 / %s",
                    this.nadstropje, this.kvadratura, this.namembnost);
        }

        // po potrebi dopolnite ...
    }

    public static Set<String> namembnosti(List<Prostor> prostori) {
        // popravite / dopolnite ...
        return null;
    }

    public static void uredi(List<Prostor> prostori) {
        // dopolnite ...
    }

    public static Map<Integer, Map<String, Integer>> statistika(List<Prostor> prostori) {
        // popravite / dopolnite ...
        return null;
    }
}
