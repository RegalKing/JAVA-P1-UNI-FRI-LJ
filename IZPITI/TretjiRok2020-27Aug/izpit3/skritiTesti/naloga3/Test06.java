
public class Test06 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Bukev(90, 61),
            new Tretja.Breza(83, 17),
            new Tretja.Bor(0, 35),
            new Tretja.Jelka(74, 63),
            new Tretja.Bor(2, 48),
            new Tretja.Smreka(68, 36),
            new Tretja.Breza(54, 11),
            new Tretja.Bukev(99, 8),
            new Tretja.Breza(1, 97),
            new Tretja.Smreka(15, 87),
        };
        System.out.println(drevesa[2].d2(drevesa[9]));
        System.out.println(drevesa[3].d2(drevesa[5]));
        System.out.println(drevesa[9].d2(drevesa[5]));
        System.out.println(drevesa[8].d2(drevesa[6]));
        System.out.println(drevesa[3].d2(drevesa[3]));
        System.out.println(drevesa[6].d2(drevesa[9]));
        System.out.println(drevesa[4].d2(drevesa[1]));
        System.out.println(drevesa[7].d2(drevesa[0]));
        System.out.println(drevesa[9].d2(drevesa[7]));
        System.out.println(drevesa[3].d2(drevesa[5]));
    }
}
