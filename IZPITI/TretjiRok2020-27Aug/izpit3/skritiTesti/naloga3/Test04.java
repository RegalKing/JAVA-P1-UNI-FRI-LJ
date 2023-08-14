
public class Test04 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Smreka(9, 5),
            new Tretja.Smreka(5, 1),
            new Tretja.Bor(1, 3),
            new Tretja.Jelka(4, 2),
            new Tretja.Bor(9, 0),
            new Tretja.Breza(0, 0),
            new Tretja.Bukev(2, 9),
            new Tretja.Smreka(6, 7),
            new Tretja.Jelka(3, 5),
            new Tretja.Breza(3, 6),
        };
        System.out.println(drevesa[9].d2(drevesa[4]));
        System.out.println(drevesa[2].d2(drevesa[8]));
        System.out.println(drevesa[6].d2(drevesa[2]));
        System.out.println(drevesa[7].d2(drevesa[8]));
        System.out.println(drevesa[8].d2(drevesa[1]));
        System.out.println(drevesa[8].d2(drevesa[3]));
        System.out.println(drevesa[3].d2(drevesa[4]));
        System.out.println(drevesa[3].d2(drevesa[9]));
        System.out.println(drevesa[1].d2(drevesa[2]));
        System.out.println(drevesa[1].d2(drevesa[7]));
    }
}
