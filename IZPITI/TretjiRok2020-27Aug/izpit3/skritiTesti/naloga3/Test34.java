
public class Test34 {

    public static void main(String[] args) {
        Tretja.Drevo[] drevesa0 = {
            new Tretja.Bor(361, 628),
            new Tretja.Breza(658, 703),
            new Tretja.Smreka(45, 163),
            new Tretja.Hrast(741, 342),
            new Tretja.Breza(673, 392),
            new Tretja.Bukev(382, 290),
            new Tretja.Hrast(182, 808),
            new Tretja.Smreka(605, 882),
        };
        Tretja.Gozd gozd0 = new Tretja.Gozd(drevesa0);
        System.out.println(gozd0.najblizjeIstovrstno(drevesa0[2]));

        Tretja.Drevo[] drevesa1 = {
            new Tretja.Bukev(22, 246),
            new Tretja.Bor(500, 672),
            new Tretja.Jelka(939, 297),
            new Tretja.Breza(933, 980),
            new Tretja.Bukev(696, 507),
            new Tretja.Bor(222, 601),
            new Tretja.Breza(953, 464),
            new Tretja.Bor(364, 490),
            new Tretja.Bor(499, 972),
            new Tretja.Breza(580, 872),
            new Tretja.Smreka(200, 367),
            new Tretja.Bukev(222, 186),
            new Tretja.Breza(978, 224),
            new Tretja.Bor(434, 565),
            new Tretja.Smreka(820, 539),
            new Tretja.Bukev(155, 691),
            new Tretja.Jelka(591, 639),
            new Tretja.Smreka(442, 106),
            new Tretja.Breza(382, 12),
        };
        Tretja.Gozd gozd1 = new Tretja.Gozd(drevesa1);
        System.out.println(gozd1.najblizjeIstovrstno(drevesa1[10]));

        Tretja.Drevo[] drevesa2 = {
            new Tretja.Breza(341, 895),
            new Tretja.Breza(242, 175),
            new Tretja.Breza(198, 639),
            new Tretja.Bukev(673, 725),
            new Tretja.Breza(440, 971),
            new Tretja.Smreka(203, 627),
        };
        Tretja.Gozd gozd2 = new Tretja.Gozd(drevesa2);
        System.out.println(gozd2.najblizjeIstovrstno(drevesa2[1]));

        Tretja.Drevo[] drevesa3 = {
            new Tretja.Bukev(131, 963),
            new Tretja.Bor(350, 288),
            new Tretja.Bor(307, 264),
            new Tretja.Bukev(83, 271),
            new Tretja.Smreka(287, 900),
            new Tretja.Bukev(813, 125),
            new Tretja.Breza(744, 948),
            new Tretja.Bukev(737, 462),
            new Tretja.Bor(886, 475),
            new Tretja.Smreka(606, 745),
            new Tretja.Jelka(0, 533),
            new Tretja.Jelka(391, 891),
            new Tretja.Bukev(441, 569),
            new Tretja.Hrast(123, 395),
            new Tretja.Breza(872, 73),
            new Tretja.Bor(855, 509),
            new Tretja.Bor(11, 630),
            new Tretja.Bor(816, 957),
            new Tretja.Breza(219, 942),
        };
        Tretja.Gozd gozd3 = new Tretja.Gozd(drevesa3);
        System.out.println(gozd3.najblizjeIstovrstno(drevesa3[14]));

        Tretja.Drevo[] drevesa4 = {
            new Tretja.Bor(12, 771),
            new Tretja.Bukev(983, 71),
            new Tretja.Jelka(699, 326),
            new Tretja.Jelka(386, 69),
            new Tretja.Bukev(394, 225),
            new Tretja.Bor(144, 113),
            new Tretja.Bukev(456, 887),
            new Tretja.Jelka(757, 449),
            new Tretja.Smreka(686, 907),
            new Tretja.Bor(587, 319),
            new Tretja.Jelka(33, 877),
            new Tretja.Hrast(742, 364),
            new Tretja.Jelka(248, 430),
            new Tretja.Hrast(783, 331),
            new Tretja.Smreka(48, 661),
            new Tretja.Hrast(476, 837),
            new Tretja.Jelka(447, 458),
            new Tretja.Bor(200, 562),
            new Tretja.Bor(833, 900),
            new Tretja.Jelka(734, 624),
            new Tretja.Hrast(221, 269),
            new Tretja.Breza(10, 890),
            new Tretja.Hrast(862, 400),
            new Tretja.Jelka(712, 986),
            new Tretja.Bor(469, 356),
            new Tretja.Bor(292, 929),
            new Tretja.Bukev(749, 647),
            new Tretja.Bor(250, 293),
            new Tretja.Smreka(557, 203),
            new Tretja.Breza(74, 754),
            new Tretja.Breza(543, 468),
            new Tretja.Smreka(770, 719),
        };
        Tretja.Gozd gozd4 = new Tretja.Gozd(drevesa4);
        System.out.println(gozd4.najblizjeIstovrstno(drevesa4[8]));

    }
}
