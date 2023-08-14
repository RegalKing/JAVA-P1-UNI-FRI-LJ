
public class Test44 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Breza(645, 485),
            new Tretja.Smreka(376, 440),
            new Tretja.Smreka(945, 76),
            new Tretja.Hrast(228, 554),
            new Tretja.Bukev(172, 116),
            new Tretja.Smreka(341, 454),
            new Tretja.Jelka(770, 681),
            new Tretja.Smreka(478, 822),
            new Tretja.Bor(904, 209),
            new Tretja.Jelka(643, 720),
            new Tretja.Breza(552, 917),
            new Tretja.Smreka(750, 99),
            new Tretja.Bor(647, 687),
            new Tretja.Smreka(186, 125),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[13]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Smreka(528, 192),
            new Tretja.Bor(595, 113),
            new Tretja.Jelka(192, 970),
            new Tretja.Breza(79, 213),
            new Tretja.Bukev(70, 172),
            new Tretja.Hrast(44, 630),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[5]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Hrast(635, 636),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[0]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bukev(923, 705),
            new Tretja.Bor(94, 377),
            new Tretja.Bor(829, 504),
            new Tretja.Hrast(952, 412),
            new Tretja.Jelka(28, 621),
            new Tretja.Bor(614, 704),
            new Tretja.Breza(924, 371),
            new Tretja.Jelka(931, 499),
            new Tretja.Hrast(601, 417),
            new Tretja.Hrast(577, 152),
            new Tretja.Smreka(856, 963),
            new Tretja.Smreka(415, 728),
            new Tretja.Breza(519, 498),
            new Tretja.Breza(649, 814),
            new Tretja.Breza(203, 782),
            new Tretja.Bor(611, 830),
            new Tretja.Bukev(240, 767),
            new Tretja.Bor(884, 251),
            new Tretja.Smreka(829, 589),
            new Tretja.Smreka(769, 709),
            new Tretja.Smreka(714, 536),
            new Tretja.Smreka(655, 486),
            new Tretja.Hrast(344, 547),
            new Tretja.Bukev(447, 800),
            new Tretja.Breza(310, 972),
            new Tretja.Smreka(51, 191),
            new Tretja.Breza(122, 21),
            new Tretja.Jelka(977, 385),
            new Tretja.Bor(671, 722),
            new Tretja.Breza(608, 348),
            new Tretja.Breza(654, 64),
            new Tretja.Bukev(924, 15),
            new Tretja.Bukev(685, 288),
            new Tretja.Bukev(642, 630),
            new Tretja.Hrast(941, 259),
            new Tretja.Breza(919, 756),
            new Tretja.Jelka(629, 545),
            new Tretja.Bor(164, 785),
            new Tretja.Bor(477, 799),
            new Tretja.Bor(876, 258),
            new Tretja.Bukev(750, 20),
            new Tretja.Smreka(784, 811),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[32]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Hrast(491, 419),
            new Tretja.Bor(330, 201),
            new Tretja.Hrast(531, 926),
            new Tretja.Hrast(486, 481),
            new Tretja.Jelka(971, 738),
            new Tretja.Breza(856, 932),
            new Tretja.Smreka(720, 431),
            new Tretja.Bukev(167, 668),
            new Tretja.Bor(143, 340),
            new Tretja.Smreka(237, 99),
            new Tretja.Smreka(563, 505),
            new Tretja.Smreka(87, 296),
            new Tretja.Smreka(122, 309),
            new Tretja.Hrast(886, 976),
            new Tretja.Breza(445, 323),
            new Tretja.Breza(775, 816),
            new Tretja.Bukev(584, 716),
            new Tretja.Bor(79, 835),
            new Tretja.Smreka(166, 55),
            new Tretja.Breza(549, 412),
            new Tretja.Breza(369, 859),
            new Tretja.Breza(590, 533),
            new Tretja.Hrast(939, 456),
            new Tretja.Bor(129, 415),
            new Tretja.Bor(664, 56),
            new Tretja.Breza(117, 809),
            new Tretja.Jelka(237, 737),
            new Tretja.Hrast(842, 745),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[24]));

    }
}
