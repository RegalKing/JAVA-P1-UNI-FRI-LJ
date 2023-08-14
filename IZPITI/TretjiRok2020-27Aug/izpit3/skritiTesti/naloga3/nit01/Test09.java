
public class Test09 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Jelka(23, 70),
            new Tretja.Smreka(21, 79),
            new Tretja.Smreka(80, 56),
            new Tretja.Bor(53, 68),
            new Tretja.Smreka(39, 6),
            new Tretja.Breza(42, 82),
            new Tretja.Bor(77, 72),
            new Tretja.Breza(13, 53),
            new Tretja.Jelka(85, 2),
            new Tretja.Bukev(46, 84),
        };
        System.out.println(drevesa[8].d2(drevesa[0]));
        System.out.println(drevesa[2].d2(drevesa[9]));
        System.out.println(drevesa[9].d2(drevesa[7]));
        System.out.println(drevesa[8].d2(drevesa[0]));
        System.out.println(drevesa[3].d2(drevesa[0]));
        System.out.println(drevesa[7].d2(drevesa[7]));
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[4].d2(drevesa[1]));
        System.out.println(drevesa[4].d2(drevesa[9]));
        System.out.println(drevesa[5].d2(drevesa[5]));
    }
}
