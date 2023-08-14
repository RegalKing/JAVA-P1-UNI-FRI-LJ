
public class Test36 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Breza(397, 111),
            new Tretja.Hrast(221, 221),
            new Tretja.Hrast(387, 199),
            new Tretja.Bor(630, 775),
            new Tretja.Bukev(541, 549),
            new Tretja.Hrast(78, 443),
            new Tretja.Bukev(275, 749),
            new Tretja.Breza(325, 278),
            new Tretja.Breza(753, 135),
            new Tretja.Bor(668, 85),
            new Tretja.Smreka(49, 453),
            new Tretja.Bor(514, 558),
            new Tretja.Bukev(927, 534),
            new Tretja.Jelka(638, 576),
            new Tretja.Bukev(503, 44),
            new Tretja.Bukev(282, 560),
            new Tretja.Bukev(536, 687),
            new Tretja.Breza(446, 475),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[9]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Smreka(13, 645),
            new Tretja.Bukev(699, 209),
            new Tretja.Breza(70, 2),
            new Tretja.Breza(787, 39),
            new Tretja.Bor(443, 904),
            new Tretja.Bor(211, 325),
            new Tretja.Bor(533, 143),
            new Tretja.Smreka(517, 26),
            new Tretja.Bor(22, 158),
            new Tretja.Smreka(547, 544),
            new Tretja.Bukev(157, 694),
            new Tretja.Bukev(19, 16),
            new Tretja.Hrast(943, 491),
            new Tretja.Bukev(590, 770),
            new Tretja.Hrast(651, 633),
            new Tretja.Hrast(973, 173),
            new Tretja.Bor(832, 926),
            new Tretja.Smreka(699, 145),
            new Tretja.Jelka(161, 337),
            new Tretja.Jelka(321, 53),
            new Tretja.Smreka(13, 990),
            new Tretja.Jelka(618, 237),
            new Tretja.Bukev(465, 569),
            new Tretja.Bor(117, 191),
            new Tretja.Hrast(308, 520),
            new Tretja.Hrast(277, 232),
            new Tretja.Breza(785, 183),
            new Tretja.Hrast(216, 777),
            new Tretja.Bukev(569, 554),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[15]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Jelka(633, 47),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[0]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bukev(357, 219),
            new Tretja.Bor(706, 33),
            new Tretja.Bukev(771, 196),
            new Tretja.Breza(935, 463),
            new Tretja.Hrast(326, 445),
            new Tretja.Hrast(781, 630),
            new Tretja.Bukev(789, 801),
            new Tretja.Hrast(322, 638),
            new Tretja.Bor(643, 207),
            new Tretja.Bukev(266, 748),
            new Tretja.Bor(284, 17),
            new Tretja.Hrast(138, 337),
            new Tretja.Hrast(555, 184),
            new Tretja.Jelka(909, 137),
            new Tretja.Bukev(578, 390),
            new Tretja.Jelka(179, 496),
            new Tretja.Hrast(397, 889),
            new Tretja.Bor(493, 474),
            new Tretja.Breza(959, 452),
            new Tretja.Bor(555, 25),
            new Tretja.Breza(228, 475),
            new Tretja.Jelka(688, 779),
            new Tretja.Breza(12, 774),
            new Tretja.Hrast(285, 271),
            new Tretja.Jelka(729, 389),
            new Tretja.Hrast(212, 595),
            new Tretja.Breza(403, 759),
            new Tretja.Bukev(301, 105),
            new Tretja.Jelka(76, 897),
            new Tretja.Bukev(40, 216),
            new Tretja.Bor(462, 73),
            new Tretja.Hrast(12, 120),
            new Tretja.Bor(303, 717),
            new Tretja.Jelka(850, 827),
            new Tretja.Jelka(641, 199),
            new Tretja.Smreka(875, 714),
            new Tretja.Bukev(300, 771),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[2]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Jelka(162, 555),
            new Tretja.Breza(578, 596),
            new Tretja.Bukev(619, 359),
            new Tretja.Breza(950, 351),
            new Tretja.Jelka(824, 438),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[2]));

    }
}
