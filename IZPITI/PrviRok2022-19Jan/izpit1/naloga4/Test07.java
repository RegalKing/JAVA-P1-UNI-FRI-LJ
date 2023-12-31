
import java.util.*;

public class Test07 {

    public static void main(String[] args) {

        final int ZACETEK = 2_144_482_200;
        final int ST_BREZ_IZPISA = 1_000_000;
        final int ST_IZPISOV = 20;

        Iterator<Integer> iterator = new Iterator<>() {
            Random random = new Random(12346);
            int n = ZACETEK;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return this.n += random.nextInt(2) + 1;
            }
        };

        Iterator<Integer> manjkajoci = Cetrta.manjkajoci(iterator, ZACETEK);

        for (int i = 0;  i < ST_BREZ_IZPISA;  i++) {
            manjkajoci.next();
        }
        for (int i = 0;  i < ST_IZPISOV;  i++) {
            System.out.println(manjkajoci.next());
        }
    }
}
