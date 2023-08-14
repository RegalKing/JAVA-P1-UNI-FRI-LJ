
public class Test38 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Bor(434, 623),
            new Tretja.Bor(641, 845),
            new Tretja.Bor(78, 29),
            new Tretja.Breza(699, 818),
            new Tretja.Breza(26, 504),
            new Tretja.Hrast(378, 695),
            new Tretja.Bukev(144, 146),
            new Tretja.Jelka(79, 121),
            new Tretja.Bukev(71, 136),
            new Tretja.Jelka(394, 719),
            new Tretja.Bukev(824, 860),
            new Tretja.Jelka(997, 841),
            new Tretja.Bor(674, 30),
            new Tretja.Jelka(41, 421),
            new Tretja.Breza(569, 551),
            new Tretja.Smreka(867, 972),
            new Tretja.Breza(433, 445),
            new Tretja.Bukev(118, 558),
            new Tretja.Smreka(606, 240),
            new Tretja.Jelka(435, 805),
            new Tretja.Bor(276, 290),
            new Tretja.Smreka(162, 716),
            new Tretja.Smreka(526, 794),
            new Tretja.Bukev(586, 825),
            new Tretja.Hrast(223, 354),
            new Tretja.Breza(899, 573),
            new Tretja.Bor(986, 104),
            new Tretja.Breza(236, 233),
            new Tretja.Smreka(518, 304),
            new Tretja.Breza(729, 639),
            new Tretja.Bukev(785, 978),
            new Tretja.Hrast(224, 892),
            new Tretja.Bor(462, 967),
            new Tretja.Bor(94, 348),
            new Tretja.Bor(434, 944),
            new Tretja.Bor(756, 676),
            new Tretja.Breza(58, 731),
            new Tretja.Smreka(921, 600),
            new Tretja.Breza(719, 984),
            new Tretja.Smreka(33, 468),
            new Tretja.Bor(182, 902),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[19]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Hrast(909, 494),
            new Tretja.Breza(474, 868),
            new Tretja.Bukev(50, 599),
            new Tretja.Breza(423, 631),
            new Tretja.Breza(447, 191),
            new Tretja.Jelka(703, 587),
            new Tretja.Smreka(361, 494),
            new Tretja.Jelka(811, 979),
            new Tretja.Breza(112, 229),
            new Tretja.Breza(907, 307),
            new Tretja.Bor(329, 862),
            new Tretja.Hrast(779, 979),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[3]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Hrast(747, 606),
            new Tretja.Breza(746, 669),
            new Tretja.Breza(533, 563),
            new Tretja.Bukev(93, 359),
            new Tretja.Breza(218, 950),
            new Tretja.Smreka(52, 738),
            new Tretja.Bor(0, 683),
            new Tretja.Breza(299, 182),
            new Tretja.Breza(600, 556),
            new Tretja.Bukev(840, 142),
            new Tretja.Bukev(685, 219),
            new Tretja.Smreka(321, 727),
            new Tretja.Bukev(611, 225),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[11]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Jelka(173, 236),
            new Tretja.Jelka(866, 852),
            new Tretja.Bor(336, 288),
            new Tretja.Bor(257, 696),
            new Tretja.Smreka(938, 855),
            new Tretja.Smreka(612, 413),
            new Tretja.Breza(880, 321),
            new Tretja.Hrast(998, 126),
            new Tretja.Breza(951, 391),
            new Tretja.Breza(164, 454),
            new Tretja.Breza(226, 3),
            new Tretja.Hrast(578, 530),
            new Tretja.Bukev(915, 747),
            new Tretja.Breza(523, 985),
            new Tretja.Smreka(851, 738),
            new Tretja.Jelka(237, 346),
            new Tretja.Hrast(718, 385),
            new Tretja.Breza(372, 253),
            new Tretja.Breza(939, 419),
            new Tretja.Hrast(173, 104),
            new Tretja.Jelka(867, 982),
            new Tretja.Hrast(994, 653),
            new Tretja.Smreka(45, 866),
            new Tretja.Jelka(921, 772),
            new Tretja.Smreka(544, 266),
            new Tretja.Bor(181, 755),
            new Tretja.Bukev(933, 942),
            new Tretja.Hrast(951, 329),
            new Tretja.Bor(368, 28),
            new Tretja.Bukev(116, 416),
            new Tretja.Jelka(756, 745),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[13]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Jelka(483, 248),
            new Tretja.Smreka(428, 455),
            new Tretja.Hrast(285, 712),
            new Tretja.Bor(242, 357),
            new Tretja.Hrast(223, 618),
            new Tretja.Jelka(319, 198),
            new Tretja.Bukev(839, 193),
            new Tretja.Jelka(557, 669),
            new Tretja.Bukev(810, 501),
            new Tretja.Breza(698, 888),
            new Tretja.Bor(34, 60),
            new Tretja.Smreka(990, 875),
            new Tretja.Bor(963, 936),
            new Tretja.Bukev(241, 963),
            new Tretja.Breza(246, 13),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[5]));

    }
}
