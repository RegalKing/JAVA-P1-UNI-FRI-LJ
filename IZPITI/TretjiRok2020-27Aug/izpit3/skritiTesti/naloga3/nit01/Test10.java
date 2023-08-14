
public class Test10 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Breza(58, 94),
            new Tretja.Breza(6, 60),
            new Tretja.Bukev(21, 26),
            new Tretja.Bor(63, 20),
            new Tretja.Jelka(76, 49),
            new Tretja.Bor(32, 8),
            new Tretja.Breza(44, 1),
            new Tretja.Jelka(87, 88),
            new Tretja.Jelka(42, 55),
            new Tretja.Smreka(52, 99),
        };
        System.out.println(drevesa[7].d2(drevesa[9]));
        System.out.println(drevesa[2].d2(drevesa[2]));
        System.out.println(drevesa[4].d2(drevesa[1]));
        System.out.println(drevesa[9].d2(drevesa[1]));
        System.out.println(drevesa[7].d2(drevesa[9]));
        System.out.println(drevesa[7].d2(drevesa[8]));
        System.out.println(drevesa[3].d2(drevesa[2]));
        System.out.println(drevesa[1].d2(drevesa[1]));
        System.out.println(drevesa[1].d2(drevesa[1]));
        System.out.println(drevesa[1].d2(drevesa[1]));
    }
}
