
public class Test09 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Smreka(577, 824),
            new Tretja.Bor(257, 269),
            new Tretja.Smreka(398, 563),
            new Tretja.Bor(706, 460),
            new Tretja.Breza(944, 648),
            new Tretja.Bor(76, 217),
            new Tretja.Jelka(527, 564),
            new Tretja.Hrast(863, 929),
            new Tretja.Breza(208, 277),
            new Tretja.Hrast(87, 250),
            new Tretja.Hrast(644, 553),
            new Tretja.Hrast(626, 579),
            new Tretja.Smreka(611, 687),
            new Tretja.Smreka(235, 784),
            new Tretja.Hrast(932, 289),
            new Tretja.Bukev(764, 894),
            new Tretja.Hrast(778, 99),
            new Tretja.Breza(213, 572),
            new Tretja.Hrast(576, 501),
            new Tretja.Breza(308, 640),
            new Tretja.Bukev(430, 241),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[3]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Hrast(60, 290),
            new Tretja.Hrast(896, 383),
            new Tretja.Bukev(633, 649),
            new Tretja.Breza(743, 81),
            new Tretja.Smreka(569, 984),
            new Tretja.Jelka(765, 277),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[0]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Bukev(835, 881),
            new Tretja.Smreka(882, 204),
            new Tretja.Bor(350, 526),
            new Tretja.Bukev(38, 840),
            new Tretja.Hrast(681, 957),
            new Tretja.Bukev(91, 697),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[3]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Jelka(925, 171),
            new Tretja.Jelka(483, 483),
            new Tretja.Breza(86, 176),
            new Tretja.Bukev(126, 1),
            new Tretja.Breza(49, 190),
            new Tretja.Smreka(504, 481),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[5]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Breza(730, 753),
            new Tretja.Breza(699, 113),
            new Tretja.Bukev(603, 210),
            new Tretja.Jelka(969, 84),
            new Tretja.Smreka(624, 230),
            new Tretja.Breza(257, 921),
            new Tretja.Breza(230, 233),
            new Tretja.Jelka(978, 397),
            new Tretja.Breza(37, 392),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[1]));

    }
}
