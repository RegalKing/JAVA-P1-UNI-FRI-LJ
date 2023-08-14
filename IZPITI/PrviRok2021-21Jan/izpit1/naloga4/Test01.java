
import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(50, 20, 30), 5, 6),
            new Cetrta.Krog(       new Cetrta.Barva(70, 80, 30), 7),
            new Cetrta.Kvadrat(    new Cetrta.Barva(40, 60, 80), 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(50, 20, 20), 1, 10),
            new Cetrta.Kvadrat(    new Cetrta.Barva(40, 50, 90), 9),
            new Cetrta.Krog(       new Cetrta.Barva(60, 90, 90), 4),
            new Cetrta.Kvadrat(    new Cetrta.Barva(40, 60, 70), 5)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
