
public class Test08 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Breza(604, 159),
            new Tretja.Jelka(113, 828),
            new Tretja.Bor(139, 757),
            new Tretja.Smreka(917, 363),
            new Tretja.Bukev(345, 420),
            new Tretja.Jelka(376, 957),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[3]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Jelka(255, 212),
            new Tretja.Hrast(504, 756),
            new Tretja.Smreka(573, 533),
            new Tretja.Bukev(670, 85),
            new Tretja.Breza(339, 518),
            new Tretja.Bukev(756, 991),
            new Tretja.Hrast(884, 378),
            new Tretja.Hrast(86, 296),
            new Tretja.Breza(383, 17),
            new Tretja.Smreka(466, 771),
            new Tretja.Jelka(958, 12),
            new Tretja.Breza(499, 731),
            new Tretja.Bor(139, 65),
            new Tretja.Bukev(965, 358),
            new Tretja.Jelka(709, 753),
            new Tretja.Bukev(862, 659),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[0]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Hrast(614, 878),
            new Tretja.Jelka(244, 761),
            new Tretja.Smreka(267, 365),
            new Tretja.Breza(330, 271),
            new Tretja.Bor(996, 674),
            new Tretja.Hrast(887, 730),
            new Tretja.Bukev(794, 492),
            new Tretja.Smreka(98, 791),
            new Tretja.Breza(296, 589),
            new Tretja.Hrast(913, 52),
            new Tretja.Smreka(427, 101),
            new Tretja.Breza(766, 735),
            new Tretja.Breza(27, 542),
            new Tretja.Jelka(667, 763),
            new Tretja.Breza(282, 814),
            new Tretja.Hrast(367, 213),
            new Tretja.Bukev(504, 627),
            new Tretja.Bor(437, 690),
            new Tretja.Smreka(915, 633),
            new Tretja.Bor(459, 560),
            new Tretja.Jelka(839, 358),
            new Tretja.Bor(416, 231),
            new Tretja.Smreka(764, 360),
            new Tretja.Jelka(360, 190),
            new Tretja.Jelka(44, 924),
            new Tretja.Bukev(995, 302),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[6]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bor(835, 840),
            new Tretja.Smreka(313, 555),
            new Tretja.Bor(550, 128),
            new Tretja.Hrast(168, 572),
            new Tretja.Jelka(923, 247),
            new Tretja.Jelka(64, 585),
            new Tretja.Breza(385, 804),
            new Tretja.Smreka(71, 78),
            new Tretja.Jelka(500, 401),
            new Tretja.Smreka(622, 751),
            new Tretja.Jelka(563, 290),
            new Tretja.Bukev(470, 690),
            new Tretja.Hrast(98, 667),
            new Tretja.Breza(546, 527),
            new Tretja.Jelka(748, 169),
            new Tretja.Smreka(154, 126),
            new Tretja.Bor(936, 676),
            new Tretja.Smreka(919, 290),
            new Tretja.Bor(257, 519),
            new Tretja.Breza(310, 423),
            new Tretja.Breza(196, 997),
            new Tretja.Bukev(277, 15),
            new Tretja.Breza(609, 854),
            new Tretja.Smreka(711, 170),
            new Tretja.Bukev(831, 887),
            new Tretja.Jelka(875, 756),
            new Tretja.Jelka(31, 551),
            new Tretja.Bor(524, 494),
            new Tretja.Jelka(459, 464),
            new Tretja.Hrast(286, 977),
            new Tretja.Bukev(644, 289),
            new Tretja.Smreka(117, 960),
            new Tretja.Jelka(619, 335),
            new Tretja.Jelka(320, 653),
            new Tretja.Breza(95, 159),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[23]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Bor(700, 455),
            new Tretja.Bor(668, 443),
            new Tretja.Hrast(49, 460),
            new Tretja.Hrast(673, 804),
            new Tretja.Breza(62, 360),
            new Tretja.Bukev(389, 431),
            new Tretja.Breza(352, 505),
            new Tretja.Smreka(669, 623),
            new Tretja.Jelka(415, 334),
            new Tretja.Bukev(810, 605),
            new Tretja.Bukev(431, 729),
            new Tretja.Breza(477, 800),
            new Tretja.Breza(530, 335),
            new Tretja.Bor(194, 646),
            new Tretja.Bor(59, 885),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[0]));

    }
}
