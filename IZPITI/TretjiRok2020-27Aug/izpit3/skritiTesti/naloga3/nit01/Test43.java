
public class Test43 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Hrast(807, 775),
            new Tretja.Breza(459, 877),
            new Tretja.Smreka(620, 556),
            new Tretja.Breza(163, 55),
            new Tretja.Smreka(65, 19),
            new Tretja.Bor(341, 320),
            new Tretja.Jelka(3, 207),
            new Tretja.Smreka(885, 815),
            new Tretja.Jelka(22, 110),
            new Tretja.Breza(626, 858),
            new Tretja.Jelka(344, 801),
            new Tretja.Breza(697, 89),
            new Tretja.Bor(880, 655),
            new Tretja.Bor(893, 177),
            new Tretja.Bukev(714, 175),
            new Tretja.Bor(995, 139),
            new Tretja.Hrast(950, 333),
            new Tretja.Bukev(521, 311),
            new Tretja.Hrast(953, 609),
            new Tretja.Hrast(527, 948),
            new Tretja.Smreka(210, 651),
            new Tretja.Smreka(875, 940),
            new Tretja.Smreka(804, 907),
            new Tretja.Jelka(568, 652),
            new Tretja.Bor(363, 596),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[13]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Breza(416, 548),
            new Tretja.Breza(156, 96),
            new Tretja.Smreka(791, 950),
            new Tretja.Hrast(214, 283),
            new Tretja.Jelka(256, 371),
            new Tretja.Hrast(933, 931),
            new Tretja.Breza(343, 243),
            new Tretja.Jelka(309, 831),
            new Tretja.Hrast(954, 600),
            new Tretja.Bor(383, 759),
            new Tretja.Bor(579, 727),
            new Tretja.Breza(562, 984),
            new Tretja.Bukev(232, 487),
            new Tretja.Bukev(72, 218),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[8]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Jelka(678, 86),
            new Tretja.Breza(839, 647),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[1]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bukev(609, 761),
            new Tretja.Bor(470, 524),
            new Tretja.Breza(544, 679),
            new Tretja.Hrast(768, 255),
            new Tretja.Smreka(99, 594),
            new Tretja.Bukev(160, 817),
            new Tretja.Jelka(550, 110),
            new Tretja.Bor(83, 47),
            new Tretja.Jelka(226, 462),
            new Tretja.Bukev(451, 78),
            new Tretja.Bor(339, 418),
            new Tretja.Breza(286, 73),
            new Tretja.Smreka(308, 32),
            new Tretja.Jelka(23, 839),
            new Tretja.Hrast(802, 479),
            new Tretja.Bukev(768, 982),
            new Tretja.Smreka(965, 657),
            new Tretja.Jelka(814, 627),
            new Tretja.Breza(855, 93),
            new Tretja.Jelka(63, 103),
            new Tretja.Jelka(765, 725),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[5]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Bukev(465, 99),
            new Tretja.Jelka(847, 514),
            new Tretja.Bukev(845, 617),
            new Tretja.Jelka(302, 861),
            new Tretja.Breza(52, 116),
            new Tretja.Bukev(102, 878),
            new Tretja.Smreka(702, 162),
            new Tretja.Jelka(773, 429),
            new Tretja.Smreka(610, 184),
            new Tretja.Bukev(261, 933),
            new Tretja.Hrast(820, 580),
            new Tretja.Bor(231, 0),
            new Tretja.Jelka(653, 306),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[9]));

    }
}
