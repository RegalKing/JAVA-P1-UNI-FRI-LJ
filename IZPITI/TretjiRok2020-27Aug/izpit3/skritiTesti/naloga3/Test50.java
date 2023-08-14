
public class Test50 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Jelka(755, 928),
            new Tretja.Bukev(971, 619),
            new Tretja.Breza(975, 421),
            new Tretja.Bor(127, 664),
            new Tretja.Jelka(636, 412),
            new Tretja.Breza(857, 325),
            new Tretja.Hrast(474, 417),
            new Tretja.Hrast(843, 792),
            new Tretja.Jelka(377, 78),
            new Tretja.Breza(690, 221),
            new Tretja.Breza(419, 596),
            new Tretja.Jelka(907, 839),
            new Tretja.Smreka(884, 601),
            new Tretja.Hrast(148, 719),
            new Tretja.Hrast(23, 20),
            new Tretja.Breza(166, 204),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[9]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Breza(486, 640),
            new Tretja.Breza(532, 313),
            new Tretja.Bukev(372, 54),
            new Tretja.Hrast(94, 336),
            new Tretja.Bor(367, 594),
            new Tretja.Bor(941, 996),
            new Tretja.Bor(757, 28),
            new Tretja.Hrast(982, 669),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[4]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Jelka(173, 6),
            new Tretja.Jelka(103, 185),
            new Tretja.Smreka(887, 614),
            new Tretja.Bor(39, 686),
            new Tretja.Bor(342, 61),
            new Tretja.Smreka(234, 859),
            new Tretja.Hrast(440, 179),
            new Tretja.Smreka(813, 651),
            new Tretja.Bor(507, 531),
            new Tretja.Bor(398, 730),
            new Tretja.Hrast(657, 784),
            new Tretja.Bukev(683, 629),
            new Tretja.Hrast(662, 543),
            new Tretja.Breza(740, 258),
            new Tretja.Bor(185, 444),
            new Tretja.Breza(16, 904),
            new Tretja.Breza(884, 197),
            new Tretja.Hrast(132, 216),
            new Tretja.Jelka(655, 752),
            new Tretja.Jelka(319, 383),
            new Tretja.Bukev(28, 581),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[20]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bukev(728, 252),
            new Tretja.Bukev(963, 612),
            new Tretja.Smreka(488, 155),
            new Tretja.Bukev(119, 930),
            new Tretja.Hrast(14, 927),
            new Tretja.Smreka(892, 463),
            new Tretja.Smreka(354, 884),
            new Tretja.Jelka(985, 922),
            new Tretja.Smreka(843, 960),
            new Tretja.Hrast(746, 609),
            new Tretja.Bukev(301, 69),
            new Tretja.Smreka(166, 685),
            new Tretja.Bor(655, 343),
            new Tretja.Hrast(465, 990),
            new Tretja.Jelka(80, 749),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[2]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Hrast(814, 986),
            new Tretja.Bukev(196, 80),
            new Tretja.Breza(731, 159),
            new Tretja.Breza(143, 704),
            new Tretja.Smreka(20, 489),
            new Tretja.Smreka(46, 411),
            new Tretja.Smreka(454, 0),
            new Tretja.Bukev(857, 559),
            new Tretja.Smreka(781, 557),
            new Tretja.Breza(69, 404),
            new Tretja.Jelka(992, 468),
            new Tretja.Hrast(695, 723),
            new Tretja.Bukev(980, 16),
            new Tretja.Breza(161, 850),
            new Tretja.Smreka(578, 710),
            new Tretja.Hrast(238, 754),
            new Tretja.Bor(697, 52),
            new Tretja.Bukev(272, 610),
            new Tretja.Hrast(184, 170),
            new Tretja.Hrast(599, 801),
            new Tretja.Hrast(147, 618),
            new Tretja.Breza(708, 770),
            new Tretja.Breza(495, 868),
            new Tretja.Breza(164, 229),
            new Tretja.Bukev(772, 751),
            new Tretja.Breza(861, 364),
            new Tretja.Bukev(3, 620),
            new Tretja.Hrast(726, 630),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[19]));

    }
}
