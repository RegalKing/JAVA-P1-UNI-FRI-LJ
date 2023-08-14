
public class Test12 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Bor(884, 154),
            new Tretja.Bor(344, 937),
            new Tretja.Smreka(275, 766),
            new Tretja.Hrast(417, 820),
            new Tretja.Bukev(989, 933),
            new Tretja.Bor(732, 822),
            new Tretja.Jelka(775, 404),
            new Tretja.Hrast(508, 338),
            new Tretja.Smreka(855, 907),
            new Tretja.Smreka(10, 760),
        };
        System.out.println(drevesa[5].d2(drevesa[3]));
        System.out.println(drevesa[0].d2(drevesa[9]));
        System.out.println(drevesa[9].d2(drevesa[4]));
        System.out.println(drevesa[2].d2(drevesa[9]));
        System.out.println(drevesa[6].d2(drevesa[9]));
        System.out.println(drevesa[2].d2(drevesa[6]));
        System.out.println(drevesa[9].d2(drevesa[4]));
        System.out.println(drevesa[8].d2(drevesa[4]));
        System.out.println(drevesa[3].d2(drevesa[9]));
        System.out.println(drevesa[6].d2(drevesa[9]));
    }
}
