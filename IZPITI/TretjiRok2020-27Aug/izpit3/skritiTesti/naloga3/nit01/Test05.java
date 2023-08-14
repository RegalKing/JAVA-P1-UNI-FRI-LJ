
public class Test05 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Jelka(8, 7),
            new Tretja.Hrast(9, 2),
            new Tretja.Hrast(6, 7),
            new Tretja.Bor(3, 6),
            new Tretja.Bor(9, 1),
            new Tretja.Bukev(5, 1),
            new Tretja.Bor(3, 7),
            new Tretja.Breza(9, 4),
            new Tretja.Hrast(6, 9),
            new Tretja.Bor(7, 4),
        };
        System.out.println(drevesa[0].d2(drevesa[4]));
        System.out.println(drevesa[4].d2(drevesa[1]));
        System.out.println(drevesa[1].d2(drevesa[0]));
        System.out.println(drevesa[9].d2(drevesa[9]));
        System.out.println(drevesa[6].d2(drevesa[9]));
        System.out.println(drevesa[4].d2(drevesa[5]));
        System.out.println(drevesa[3].d2(drevesa[9]));
        System.out.println(drevesa[0].d2(drevesa[3]));
        System.out.println(drevesa[5].d2(drevesa[1]));
        System.out.println(drevesa[3].d2(drevesa[3]));
    }
}
