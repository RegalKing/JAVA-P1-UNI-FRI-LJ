
public class Test46 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Bukev(140, 103),
            new Tretja.Hrast(147, 327),
            new Tretja.Jelka(262, 219),
            new Tretja.Jelka(164, 720),
            new Tretja.Breza(836, 461),
            new Tretja.Jelka(363, 580),
            new Tretja.Bor(104, 840),
            new Tretja.Jelka(434, 170),
            new Tretja.Hrast(231, 181),
            new Tretja.Bukev(570, 427),
            new Tretja.Bukev(100, 692),
            new Tretja.Hrast(69, 964),
            new Tretja.Breza(602, 698),
            new Tretja.Smreka(479, 967),
            new Tretja.Jelka(965, 973),
            new Tretja.Hrast(429, 674),
            new Tretja.Breza(783, 900),
            new Tretja.Bukev(289, 662),
            new Tretja.Bukev(179, 491),
            new Tretja.Hrast(336, 381),
            new Tretja.Bor(663, 338),
            new Tretja.Smreka(732, 674),
            new Tretja.Jelka(479, 647),
            new Tretja.Breza(723, 963),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[4]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Bor(590, 932),
            new Tretja.Jelka(624, 599),
            new Tretja.Jelka(505, 85),
            new Tretja.Bor(945, 144),
            new Tretja.Bor(428, 787),
            new Tretja.Bor(821, 361),
            new Tretja.Bor(906, 6),
            new Tretja.Hrast(976, 688),
            new Tretja.Hrast(836, 804),
            new Tretja.Smreka(338, 569),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[0]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Breza(924, 675),
            new Tretja.Breza(677, 841),
            new Tretja.Breza(811, 566),
            new Tretja.Smreka(225, 777),
            new Tretja.Jelka(543, 161),
            new Tretja.Bukev(884, 364),
            new Tretja.Bor(148, 855),
            new Tretja.Hrast(139, 892),
            new Tretja.Bukev(660, 101),
            new Tretja.Jelka(772, 196),
            new Tretja.Jelka(729, 673),
            new Tretja.Smreka(863, 840),
            new Tretja.Jelka(724, 654),
            new Tretja.Hrast(527, 514),
            new Tretja.Smreka(874, 622),
            new Tretja.Smreka(997, 942),
            new Tretja.Bor(378, 35),
            new Tretja.Hrast(178, 348),
            new Tretja.Bukev(885, 927),
            new Tretja.Breza(549, 749),
            new Tretja.Hrast(629, 917),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[18]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Hrast(316, 292),
            new Tretja.Breza(923, 146),
            new Tretja.Breza(970, 175),
            new Tretja.Hrast(885, 692),
            new Tretja.Hrast(511, 651),
            new Tretja.Breza(809, 316),
            new Tretja.Smreka(124, 338),
            new Tretja.Hrast(872, 549),
            new Tretja.Bor(267, 786),
            new Tretja.Jelka(60, 461),
            new Tretja.Hrast(642, 782),
            new Tretja.Hrast(711, 726),
            new Tretja.Jelka(249, 872),
            new Tretja.Jelka(475, 917),
            new Tretja.Bukev(302, 251),
            new Tretja.Bukev(97, 526),
            new Tretja.Bor(66, 122),
            new Tretja.Hrast(260, 473),
            new Tretja.Breza(602, 599),
            new Tretja.Bukev(724, 840),
            new Tretja.Smreka(384, 358),
            new Tretja.Bor(134, 586),
            new Tretja.Hrast(236, 302),
            new Tretja.Smreka(809, 709),
            new Tretja.Smreka(693, 482),
            new Tretja.Jelka(23, 77),
            new Tretja.Hrast(708, 937),
            new Tretja.Jelka(166, 555),
            new Tretja.Bor(544, 277),
            new Tretja.Hrast(882, 886),
            new Tretja.Jelka(646, 888),
            new Tretja.Bukev(929, 768),
            new Tretja.Smreka(584, 833),
            new Tretja.Breza(229, 241),
            new Tretja.Jelka(966, 537),
            new Tretja.Smreka(516, 808),
            new Tretja.Hrast(906, 334),
            new Tretja.Bukev(997, 231),
            new Tretja.Hrast(30, 642),
            new Tretja.Breza(721, 45),
            new Tretja.Jelka(857, 833),
            new Tretja.Breza(869, 635),
            new Tretja.Smreka(875, 75),
            new Tretja.Bukev(926, 162),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[14]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Breza(415, 758),
            new Tretja.Bukev(832, 403),
            new Tretja.Bor(463, 714),
            new Tretja.Smreka(344, 404),
            new Tretja.Breza(848, 66),
            new Tretja.Bukev(487, 68),
            new Tretja.Hrast(786, 346),
            new Tretja.Jelka(189, 502),
            new Tretja.Breza(315, 310),
            new Tretja.Breza(881, 786),
            new Tretja.Breza(669, 939),
            new Tretja.Hrast(475, 728),
            new Tretja.Jelka(930, 181),
            new Tretja.Jelka(385, 797),
            new Tretja.Jelka(690, 869),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[5]));

    }
}
