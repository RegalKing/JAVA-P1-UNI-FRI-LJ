
public class Test02 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Smreka(37, 3),
            new Tretja.Jelka(83, 67),
            new Tretja.Hrast(21, 55),
            new Tretja.Breza(24, 77),
            new Tretja.Hrast(66, 93),
            new Tretja.Bukev(46, 32),
            new Tretja.Bukev(55, 17),
            new Tretja.Jelka(10, 85),
            new Tretja.Hrast(0, 9),
            new Tretja.Smreka(81, 74),
        };
        System.out.println(drevesa[7].d2(drevesa[6]));
        System.out.println(drevesa[3].d2(drevesa[3]));
        System.out.println(drevesa[2].d2(drevesa[9]));
        System.out.println(drevesa[2].d2(drevesa[3]));
        System.out.println(drevesa[5].d2(drevesa[5]));
        System.out.println(drevesa[2].d2(drevesa[0]));
        System.out.println(drevesa[5].d2(drevesa[3]));
        System.out.println(drevesa[0].d2(drevesa[9]));
        System.out.println(drevesa[4].d2(drevesa[7]));
        System.out.println(drevesa[4].d2(drevesa[5]));
    }
}
