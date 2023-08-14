
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Oddajnik krvavec = new Tretja.Oddajnik();
        Tretja.Sprejemnik ana = new Tretja.Sprejemnik(krvavec);

        Tretja.Oddajnik nanos = new Tretja.Oddajnik();
        Tretja.Sprejemnik cvetka = new Tretja.Sprejemnik(nanos);

        krvavec.oddaj('P');
        nanos.oddaj('G');
        krvavec.oddaj('r');
        nanos.oddaj('E');
        nanos.oddaj('i');

        System.out.println(ana.koliko());
        System.out.println(cvetka.koliko());
    }
}
