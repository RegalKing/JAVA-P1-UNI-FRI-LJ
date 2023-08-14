
public class Test13 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Smreka(393, 233),
            new Tretja.Bor(642, 290),
            new Tretja.Bukev(135, 671),
            new Tretja.Breza(908, 718),
            new Tretja.Hrast(781, 159),
            new Tretja.Bor(656, 9),
            new Tretja.Jelka(978, 169),
            new Tretja.Bukev(660, 493),
            new Tretja.Hrast(634, 793),
            new Tretja.Smreka(746, 279),
        };
        System.out.println(drevesa[3].d2(drevesa[7]));
        System.out.println(drevesa[4].d2(drevesa[8]));
        System.out.println(drevesa[6].d2(drevesa[9]));
        System.out.println(drevesa[4].d2(drevesa[4]));
        System.out.println(drevesa[7].d2(drevesa[7]));
        System.out.println(drevesa[1].d2(drevesa[0]));
        System.out.println(drevesa[4].d2(drevesa[2]));
        System.out.println(drevesa[2].d2(drevesa[0]));
        System.out.println(drevesa[1].d2(drevesa[9]));
        System.out.println(drevesa[7].d2(drevesa[6]));
    }
}
