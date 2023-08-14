
public class Test48 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Bor(170, 845),
            new Tretja.Bukev(837, 107),
            new Tretja.Bukev(458, 492),
            new Tretja.Smreka(575, 222),
            new Tretja.Hrast(411, 575),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[2]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Jelka(277, 183),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[0]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Hrast(689, 677),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[0]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Breza(423, 946),
            new Tretja.Jelka(709, 405),
            new Tretja.Jelka(501, 298),
            new Tretja.Jelka(710, 463),
            new Tretja.Bor(470, 714),
            new Tretja.Jelka(221, 238),
            new Tretja.Breza(385, 600),
            new Tretja.Smreka(763, 16),
            new Tretja.Hrast(909, 624),
            new Tretja.Hrast(116, 523),
            new Tretja.Hrast(506, 415),
            new Tretja.Bor(863, 825),
            new Tretja.Hrast(309, 902),
            new Tretja.Hrast(337, 419),
            new Tretja.Smreka(357, 899),
            new Tretja.Breza(370, 64),
            new Tretja.Bukev(583, 41),
            new Tretja.Bukev(800, 291),
            new Tretja.Jelka(206, 208),
            new Tretja.Hrast(794, 392),
            new Tretja.Smreka(652, 800),
            new Tretja.Smreka(324, 831),
            new Tretja.Jelka(779, 561),
            new Tretja.Smreka(271, 731),
            new Tretja.Smreka(303, 627),
            new Tretja.Breza(536, 141),
            new Tretja.Bor(725, 893),
            new Tretja.Bukev(469, 196),
            new Tretja.Hrast(137, 833),
            new Tretja.Smreka(939, 571),
            new Tretja.Hrast(705, 37),
            new Tretja.Bor(795, 133),
            new Tretja.Bukev(8, 812),
            new Tretja.Smreka(150, 197),
            new Tretja.Bor(309, 687),
            new Tretja.Smreka(228, 132),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[34]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Hrast(634, 721),
            new Tretja.Hrast(215, 22),
            new Tretja.Breza(619, 279),
            new Tretja.Smreka(571, 497),
            new Tretja.Bor(93, 432),
            new Tretja.Breza(829, 561),
            new Tretja.Hrast(171, 367),
            new Tretja.Smreka(803, 437),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[4]));

    }
}
