
public class Test01 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Jelka(6, 3),
            new Tretja.Bukev(5, 2),
            new Tretja.Hrast(4, 2),
            new Tretja.Jelka(3, 7),
            new Tretja.Bukev(4, 1),
            new Tretja.Smreka(3, 3),
            new Tretja.Hrast(3, 0),
            new Tretja.Breza(6, 6),
            new Tretja.Smreka(9, 0),
            new Tretja.Bor(0, 6),
        };
        System.out.println(drevesa[7].d2(drevesa[5]));
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[3].d2(drevesa[8]));
        System.out.println(drevesa[2].d2(drevesa[0]));
        System.out.println(drevesa[8].d2(drevesa[6]));
        System.out.println(drevesa[2].d2(drevesa[4]));
        System.out.println(drevesa[5].d2(drevesa[0]));
        System.out.println(drevesa[9].d2(drevesa[6]));
        System.out.println(drevesa[3].d2(drevesa[4]));
        System.out.println(drevesa[6].d2(drevesa[2]));
    }
}
