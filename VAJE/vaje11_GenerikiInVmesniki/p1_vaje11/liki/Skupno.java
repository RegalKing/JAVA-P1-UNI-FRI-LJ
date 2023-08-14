
import java.util.*;

public class Skupno {

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }
    public static <T> Comparator<T> kompozitum(Comparator<T> prvi,Comparator<T> drugi) {
        return new Kompozitum<T>(prvi, drugi); // oba objekta poslemo objektu tipa kompozitum, kjer bomo implementirali metodo compare
    }

    private static class Kompozitum<T> implements Comparator<T> {
        private Comparator<T> prvi;
        private Comparator<T> drugi;

        public Kompozitum(Comparator<T> prvi, Comparator<T> drugi) {
            this.prvi=prvi;
            this.drugi=drugi;
        }

        @Override
        public int compare(T first, T second) { // we compare object first to object second and if the result differs from 0 we return the result, if it equals 0 we continue comparing by a 2nd standard (2nd standard==drugi)
            int value=this.prvi.compare(first, second);
            return (value==0)?(this.drugi.compare(first, second)):(value); // if value==0 continue comparing by 2nd standard, otherwise return value
        }
    }
}

