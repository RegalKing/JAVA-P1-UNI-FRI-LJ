
public class Test14 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa = {
            new Tretja.Hrast(643, 577),
            new Tretja.Breza(901, 666),
            new Tretja.Smreka(974, 64),
            new Tretja.Jelka(39, 224),
            new Tretja.Hrast(117, 34),
            new Tretja.Jelka(345, 813),
            new Tretja.Breza(68, 280),
            new Tretja.Hrast(764, 131),
            new Tretja.Smreka(303, 416),
            new Tretja.Smreka(593, 941),
        };
        System.out.println(drevesa[0].d2(drevesa[7]));
        System.out.println(drevesa[7].d2(drevesa[0]));
        System.out.println(drevesa[0].d2(drevesa[8]));
        System.out.println(drevesa[1].d2(drevesa[1]));
        System.out.println(drevesa[8].d2(drevesa[8]));
        System.out.println(drevesa[6].d2(drevesa[5]));
        System.out.println(drevesa[9].d2(drevesa[7]));
        System.out.println(drevesa[4].d2(drevesa[8]));
        System.out.println(drevesa[5].d2(drevesa[2]));
        System.out.println(drevesa[7].d2(drevesa[9]));
    }
}
