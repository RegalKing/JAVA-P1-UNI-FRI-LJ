
public class Test03 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Bukev(418, 521),
            new Tretja.Jelka(234, 651),
            new Tretja.Breza(607, 872),
            new Tretja.Hrast(185, 319),
            new Tretja.Hrast(835, 477),
            new Tretja.Breza(423, 113),
            new Tretja.Jelka(833, 18),
            new Tretja.Hrast(861, 30),
            new Tretja.Jelka(50, 594),
            new Tretja.Bor(20, 325),
        };
        System.out.println(drevesa[8].d2(drevesa[6]));
        System.out.println(drevesa[0].d2(drevesa[0]));
        System.out.println(drevesa[7].d2(drevesa[8]));
        System.out.println(drevesa[2].d2(drevesa[2]));
        System.out.println(drevesa[3].d2(drevesa[8]));
        System.out.println(drevesa[7].d2(drevesa[2]));
        System.out.println(drevesa[2].d2(drevesa[4]));
        System.out.println(drevesa[1].d2(drevesa[8]));
        System.out.println(drevesa[9].d2(drevesa[2]));
        System.out.println(drevesa[5].d2(drevesa[3]));
    }
}
