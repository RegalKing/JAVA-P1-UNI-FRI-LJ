
public class Test01 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Breza(4, 5),
            new Tretja.Smreka(6, 2),
            new Tretja.Jelka(4, 9),
            new Tretja.Hrast(2, 4),
            new Tretja.Jelka(6, 3),
            new Tretja.Breza(8, 9),
            new Tretja.Bukev(9, 2),
            new Tretja.Bukev(3, 9),
            new Tretja.Smreka(2, 9),
            new Tretja.Bor(5, 8),
        };
        System.out.println(drevesa[4].d2(drevesa[2]));
        System.out.println(drevesa[5].d2(drevesa[8]));
        System.out.println(drevesa[2].d2(drevesa[0]));
        System.out.println(drevesa[4].d2(drevesa[8]));
        System.out.println(drevesa[9].d2(drevesa[3]));
        System.out.println(drevesa[9].d2(drevesa[2]));
        System.out.println(drevesa[9].d2(drevesa[1]));
        System.out.println(drevesa[9].d2(drevesa[1]));
        System.out.println(drevesa[8].d2(drevesa[5]));
        System.out.println(drevesa[1].d2(drevesa[7]));
    }
}
