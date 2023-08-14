
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<Integer> stevila = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70));
        int dolzina = stevila.size();

        // bodimo malce zlobni ...
        Iterator<Integer> it = Cetrta.razmnozevalnik(stevila, 3);
        for (int i = 0;  i < dolzina;  i++) {
            stevila.set(i, stevila.get(i) * 10);
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
