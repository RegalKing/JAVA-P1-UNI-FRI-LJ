
public class Test07 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Bukev(46, 36),
            new Tretja.Bukev(94, 22),
            new Tretja.Smreka(85, 40),
            new Tretja.Bukev(51, 15),
            new Tretja.Breza(22, 98),
            new Tretja.Bor(12, 5),
            new Tretja.Breza(63, 97),
            new Tretja.Breza(50, 85),
            new Tretja.Hrast(69, 54),
            new Tretja.Smreka(58, 23),
        };
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[4].d2(drevesa[3]));
        System.out.println(drevesa[0].d2(drevesa[7]));
        System.out.println(drevesa[7].d2(drevesa[5]));
        System.out.println(drevesa[0].d2(drevesa[9]));
        System.out.println(drevesa[8].d2(drevesa[9]));
        System.out.println(drevesa[6].d2(drevesa[5]));
        System.out.println(drevesa[4].d2(drevesa[3]));
        System.out.println(drevesa[9].d2(drevesa[1]));
        System.out.println(drevesa[5].d2(drevesa[9]));
    }
}
