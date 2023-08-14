
public class Test45 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Jelka(842, 290),
            new Tretja.Jelka(311, 762),
            new Tretja.Hrast(769, 987),
            new Tretja.Bukev(500, 635),
            new Tretja.Bor(469, 326),
            new Tretja.Hrast(927, 749),
            new Tretja.Bor(559, 775),
            new Tretja.Hrast(299, 511),
            new Tretja.Jelka(421, 725),
            new Tretja.Jelka(581, 404),
            new Tretja.Hrast(540, 460),
            new Tretja.Smreka(423, 569),
            new Tretja.Bor(657, 315),
            new Tretja.Bor(970, 387),
            new Tretja.Hrast(667, 115),
            new Tretja.Hrast(245, 275),
            new Tretja.Smreka(462, 696),
            new Tretja.Jelka(33, 53),
            new Tretja.Jelka(265, 815),
            new Tretja.Breza(422, 188),
            new Tretja.Jelka(902, 537),
            new Tretja.Bor(125, 416),
            new Tretja.Bor(292, 871),
            new Tretja.Bukev(522, 922),
            new Tretja.Hrast(752, 328),
            new Tretja.Hrast(238, 31),
            new Tretja.Jelka(227, 622),
            new Tretja.Bukev(507, 934),
            new Tretja.Hrast(578, 566),
            new Tretja.Jelka(168, 247),
            new Tretja.Hrast(311, 712),
            new Tretja.Breza(693, 626),
            new Tretja.Smreka(154, 51),
            new Tretja.Bukev(82, 442),
            new Tretja.Hrast(144, 647),
            new Tretja.Smreka(234, 175),
            new Tretja.Bor(919, 386),
            new Tretja.Bukev(871, 842),
            new Tretja.Jelka(576, 104),
            new Tretja.Bukev(982, 720),
            new Tretja.Smreka(160, 763),
            new Tretja.Bukev(933, 35),
            new Tretja.Bor(564, 371),
            new Tretja.Hrast(450, 447),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[39]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Jelka(643, 653),
            new Tretja.Breza(471, 841),
            new Tretja.Breza(117, 845),
            new Tretja.Hrast(286, 611),
            new Tretja.Hrast(815, 526),
            new Tretja.Hrast(554, 22),
            new Tretja.Bukev(786, 771),
            new Tretja.Jelka(887, 519),
            new Tretja.Jelka(460, 413),
            new Tretja.Hrast(51, 201),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[4]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Breza(688, 346),
            new Tretja.Bukev(225, 434),
            new Tretja.Smreka(966, 242),
            new Tretja.Smreka(201, 912),
            new Tretja.Smreka(625, 439),
            new Tretja.Jelka(84, 804),
            new Tretja.Breza(318, 401),
            new Tretja.Bor(368, 239),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[7]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Hrast(448, 631),
            new Tretja.Breza(70, 961),
            new Tretja.Hrast(645, 4),
            new Tretja.Bor(175, 451),
            new Tretja.Smreka(627, 806),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[1]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Smreka(691, 44),
            new Tretja.Hrast(189, 740),
            new Tretja.Bor(461, 73),
            new Tretja.Bukev(49, 629),
            new Tretja.Breza(454, 213),
            new Tretja.Bor(981, 590),
            new Tretja.Breza(511, 958),
            new Tretja.Bor(358, 781),
            new Tretja.Breza(249, 145),
            new Tretja.Smreka(962, 645),
            new Tretja.Breza(995, 945),
            new Tretja.Jelka(755, 938),
            new Tretja.Jelka(818, 63),
            new Tretja.Bor(623, 97),
            new Tretja.Bukev(134, 507),
            new Tretja.Jelka(180, 664),
            new Tretja.Breza(448, 126),
            new Tretja.Breza(465, 498),
            new Tretja.Smreka(3, 200),
            new Tretja.Hrast(602, 518),
            new Tretja.Bukev(238, 907),
            new Tretja.Hrast(979, 975),
            new Tretja.Bukev(758, 869),
            new Tretja.Smreka(851, 661),
            new Tretja.Smreka(41, 498),
            new Tretja.Breza(469, 419),
            new Tretja.Hrast(341, 377),
            new Tretja.Bukev(91, 187),
            new Tretja.Smreka(25, 44),
            new Tretja.Breza(204, 5),
            new Tretja.Bor(685, 981),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[13]));

    }
}
