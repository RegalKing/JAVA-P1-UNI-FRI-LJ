
public class Test02 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Jelka(1, 8),
            new Tretja.Bukev(3, 8),
            new Tretja.Breza(5, 8),
            new Tretja.Jelka(6, 0),
            new Tretja.Hrast(7, 4),
            new Tretja.Smreka(7, 0),
            new Tretja.Bukev(7, 2),
            new Tretja.Hrast(6, 1),
            new Tretja.Bor(0, 2),
            new Tretja.Hrast(4, 6),
        };
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[0].d2(drevesa[6]));
        System.out.println(drevesa[0].d2(drevesa[1]));
        System.out.println(drevesa[0].d2(drevesa[9]));
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[1].d2(drevesa[0]));
        System.out.println(drevesa[5].d2(drevesa[2]));
        System.out.println(drevesa[4].d2(drevesa[8]));
        System.out.println(drevesa[4].d2(drevesa[8]));
        System.out.println(drevesa[0].d2(drevesa[9]));
    }
}
