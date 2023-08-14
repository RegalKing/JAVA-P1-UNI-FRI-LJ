
public class Test16 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Breza(533, 661),
            new Tretja.Breza(318, 898),
            new Tretja.Bukev(515, 583),
            new Tretja.Bor(774, 8),
            new Tretja.Smreka(505, 451),
            new Tretja.Bor(903, 82),
            new Tretja.Hrast(933, 705),
            new Tretja.Jelka(272, 467),
            new Tretja.Smreka(33, 160),
            new Tretja.Bukev(950, 426),
        };
        System.out.println(drevesa[8].d2(drevesa[7]));
        System.out.println(drevesa[5].d2(drevesa[8]));
        System.out.println(drevesa[1].d2(drevesa[9]));
        System.out.println(drevesa[0].d2(drevesa[2]));
        System.out.println(drevesa[0].d2(drevesa[7]));
        System.out.println(drevesa[2].d2(drevesa[2]));
        System.out.println(drevesa[4].d2(drevesa[7]));
        System.out.println(drevesa[3].d2(drevesa[1]));
        System.out.println(drevesa[7].d2(drevesa[9]));
        System.out.println(drevesa[7].d2(drevesa[1]));
    }
}
