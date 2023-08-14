
import java.util.*;

public class Test04 {

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
        System.out.println("<" + ana.odZadnjic() + ">");
        System.out.println("<" + cvetka.odZadnjic() + ">");

        nanos.oddaj('m');
        nanos.oddaj('T');
        System.out.println("<" + ana.odZadnjic() + ">");
        System.out.println("<" + cvetka.odZadnjic() + ">");

        krvavec.oddaj('z');
        krvavec.oddaj('V');
        nanos.oddaj('w');
        krvavec.oddaj('y');
        krvavec.oddaj('C');
        krvavec.oddaj('b');
        System.out.println("<" + ana.odZadnjic() + ">");
        System.out.println("<" + cvetka.odZadnjic() + ">");
    }
}
