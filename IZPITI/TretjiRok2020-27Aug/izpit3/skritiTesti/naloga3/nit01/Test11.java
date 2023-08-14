
public class Test11 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Smreka(96, 94),
            new Tretja.Jelka(87, 1),
            new Tretja.Bukev(63, 36),
            new Tretja.Hrast(7, 58),
            new Tretja.Hrast(60, 39),
            new Tretja.Breza(74, 23),
            new Tretja.Bukev(8, 49),
            new Tretja.Breza(22, 62),
            new Tretja.Bor(68, 84),
            new Tretja.Smreka(54, 56),
        };
        System.out.println(drevesa[0].d2(drevesa[3]));
        System.out.println(drevesa[2].d2(drevesa[6]));
        System.out.println(drevesa[9].d2(drevesa[6]));
        System.out.println(drevesa[3].d2(drevesa[9]));
        System.out.println(drevesa[3].d2(drevesa[8]));
        System.out.println(drevesa[8].d2(drevesa[7]));
        System.out.println(drevesa[1].d2(drevesa[9]));
        System.out.println(drevesa[4].d2(drevesa[2]));
        System.out.println(drevesa[0].d2(drevesa[4]));
        System.out.println(drevesa[1].d2(drevesa[2]));
    }
}
