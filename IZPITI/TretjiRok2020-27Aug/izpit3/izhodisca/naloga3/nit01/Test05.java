
public class Test05 {

    public static void main(String[] args) {
        Tretja.Gozd gozd0 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(35, 7),
            new Tretja.Bukev(33, 24),
            new Tretja.Hrast(31, 90),
            new Tretja.Hrast(27, 48),
            new Tretja.Smreka(94, 85),
            new Tretja.Bukev(49, 86),
            new Tretja.Smreka(97, 38),
            new Tretja.Breza(81, 67),
            new Tretja.Bor(15, 37),
            new Tretja.Bukev(16, 20),
            new Tretja.Jelka(42, 22),
            new Tretja.Smreka(66, 99),
        });
        System.out.println(gozd0.jeListnat());

        Tretja.Gozd gozd1 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(67, 87),
            new Tretja.Jelka(44, 73),
            new Tretja.Hrast(47, 26),
            new Tretja.Jelka(34, 34),
            new Tretja.Bukev(49, 72),
            new Tretja.Bor(29, 21),
            new Tretja.Bor(64, 0),
            new Tretja.Breza(96, 76),
            new Tretja.Hrast(63, 50),
            new Tretja.Bukev(95, 49),
        });
        System.out.println(gozd1.jeListnat());

        Tretja.Gozd gozd2 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(20, 78),
            new Tretja.Hrast(90, 61),
            new Tretja.Breza(98, 27),
            new Tretja.Bukev(0, 52),
            new Tretja.Bukev(63, 46),
            new Tretja.Hrast(9, 52),
            new Tretja.Bukev(95, 99),
            new Tretja.Hrast(9, 89),
            new Tretja.Hrast(25, 83),
            new Tretja.Breza(95, 6),
        });
        System.out.println(gozd2.jeListnat());

        Tretja.Gozd gozd3 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(69, 11),
            new Tretja.Hrast(64, 51),
            new Tretja.Jelka(8, 88),
            new Tretja.Breza(57, 67),
            new Tretja.Bukev(33, 35),
            new Tretja.Breza(85, 57),
            new Tretja.Smreka(81, 80),
            new Tretja.Bor(12, 53),
            new Tretja.Bor(49, 72),
            new Tretja.Breza(85, 47),
            new Tretja.Breza(25, 43),
        });
        System.out.println(gozd3.jeListnat());

        Tretja.Gozd gozd4 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(48, 13),
            new Tretja.Breza(65, 13),
            new Tretja.Breza(53, 79),
            new Tretja.Hrast(91, 22),
            new Tretja.Bukev(31, 44),
            new Tretja.Breza(48, 32),
            new Tretja.Bukev(71, 12),
        });
        System.out.println(gozd4.jeListnat());

        Tretja.Gozd gozd5 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(23, 61),
            new Tretja.Bor(53, 90),
            new Tretja.Bukev(20, 84),
            new Tretja.Hrast(16, 63),
            new Tretja.Bukev(4, 68),
            new Tretja.Jelka(58, 27),
            new Tretja.Jelka(26, 79),
            new Tretja.Bor(71, 70),
            new Tretja.Bukev(93, 89),
            new Tretja.Smreka(9, 75),
            new Tretja.Bor(4, 93),
            new Tretja.Breza(46, 77),
            new Tretja.Bukev(20, 79),
            new Tretja.Smreka(59, 54),
            new Tretja.Hrast(52, 94),
            new Tretja.Hrast(68, 85),
            new Tretja.Smreka(40, 68),
        });
        System.out.println(gozd5.jeListnat());

        Tretja.Gozd gozd6 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(4, 61),
            new Tretja.Breza(51, 5),
        });
        System.out.println(gozd6.jeListnat());

        Tretja.Gozd gozd7 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(28, 10),
            new Tretja.Breza(12, 27),
            new Tretja.Hrast(50, 43),
        });
        System.out.println(gozd7.jeListnat());

        Tretja.Gozd gozd8 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(89, 45),
            new Tretja.Bukev(67, 88),
            new Tretja.Bukev(3, 49),
            new Tretja.Breza(43, 19),
            new Tretja.Breza(76, 66),
        });
        System.out.println(gozd8.jeListnat());

        Tretja.Gozd gozd9 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(72, 50),
            new Tretja.Breza(54, 34),
            new Tretja.Hrast(54, 39),
            new Tretja.Breza(52, 44),
            new Tretja.Bukev(63, 22),
            new Tretja.Breza(89, 57),
            new Tretja.Bukev(87, 87),
            new Tretja.Bukev(79, 69),
        });
        System.out.println(gozd9.jeListnat());

    }
}
