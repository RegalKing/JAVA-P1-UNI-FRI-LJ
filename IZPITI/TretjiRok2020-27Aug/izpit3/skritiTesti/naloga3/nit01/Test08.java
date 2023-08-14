
public class Test08 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Jelka(39, 24),
            new Tretja.Bor(64, 45),
            new Tretja.Jelka(89, 57),
            new Tretja.Breza(44, 34),
            new Tretja.Smreka(79, 32),
            new Tretja.Bukev(33, 94),
            new Tretja.Smreka(28, 81),
            new Tretja.Hrast(59, 38),
            new Tretja.Smreka(72, 57),
            new Tretja.Hrast(41, 11),
        };
        System.out.println(drevesa[6].d2(drevesa[3]));
        System.out.println(drevesa[0].d2(drevesa[3]));
        System.out.println(drevesa[1].d2(drevesa[1]));
        System.out.println(drevesa[3].d2(drevesa[0]));
        System.out.println(drevesa[8].d2(drevesa[1]));
        System.out.println(drevesa[4].d2(drevesa[3]));
        System.out.println(drevesa[7].d2(drevesa[5]));
        System.out.println(drevesa[8].d2(drevesa[3]));
        System.out.println(drevesa[7].d2(drevesa[4]));
        System.out.println(drevesa[3].d2(drevesa[9]));
    }
}
