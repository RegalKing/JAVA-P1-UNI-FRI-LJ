
public class Test15 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Hrast(969, 993),
            new Tretja.Hrast(778, 228),
            new Tretja.Breza(83, 592),
            new Tretja.Bukev(711, 442),
            new Tretja.Smreka(383, 928),
            new Tretja.Smreka(403, 289),
            new Tretja.Breza(881, 164),
            new Tretja.Bor(521, 738),
            new Tretja.Jelka(962, 468),
            new Tretja.Smreka(147, 598),
        };
        System.out.println(drevesa[0].d2(drevesa[6]));
        System.out.println(drevesa[7].d2(drevesa[9]));
        System.out.println(drevesa[0].d2(drevesa[4]));
        System.out.println(drevesa[2].d2(drevesa[6]));
        System.out.println(drevesa[8].d2(drevesa[4]));
        System.out.println(drevesa[7].d2(drevesa[7]));
        System.out.println(drevesa[8].d2(drevesa[3]));
        System.out.println(drevesa[5].d2(drevesa[7]));
        System.out.println(drevesa[1].d2(drevesa[0]));
        System.out.println(drevesa[7].d2(drevesa[6]));
    }
}
