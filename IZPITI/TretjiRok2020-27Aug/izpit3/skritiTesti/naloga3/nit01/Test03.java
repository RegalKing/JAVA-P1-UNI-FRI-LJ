
public class Test03 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Bor(0, 5),
            new Tretja.Bukev(1, 3),
            new Tretja.Breza(2, 4),
            new Tretja.Bukev(3, 6),
            new Tretja.Jelka(5, 4),
            new Tretja.Bukev(2, 7),
            new Tretja.Bor(8, 9),
            new Tretja.Hrast(6, 6),
            new Tretja.Bukev(1, 6),
            new Tretja.Smreka(3, 0),
        };
        System.out.println(drevesa[0].d2(drevesa[6]));
        System.out.println(drevesa[1].d2(drevesa[8]));
        System.out.println(drevesa[9].d2(drevesa[0]));
        System.out.println(drevesa[9].d2(drevesa[1]));
        System.out.println(drevesa[7].d2(drevesa[3]));
        System.out.println(drevesa[0].d2(drevesa[9]));
        System.out.println(drevesa[6].d2(drevesa[7]));
        System.out.println(drevesa[5].d2(drevesa[5]));
        System.out.println(drevesa[6].d2(drevesa[2]));
        System.out.println(drevesa[9].d2(drevesa[0]));
    }
}
