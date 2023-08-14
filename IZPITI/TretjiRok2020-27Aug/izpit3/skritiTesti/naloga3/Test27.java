
public class Test27 {

    public static void main(String[] args) {
        Tretja.Gozd gozd0 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(1, 11),
            new Tretja.Breza(2, 76),
            new Tretja.Breza(64, 6),
            new Tretja.Breza(63, 89),
            new Tretja.Hrast(84, 39),
        });
        System.out.println(gozd0.jeListnat());

        Tretja.Gozd gozd1 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(84, 26),
            new Tretja.Bor(46, 27),
            new Tretja.Breza(56, 23),
            new Tretja.Hrast(96, 50),
        });
        System.out.println(gozd1.jeListnat());

        Tretja.Gozd gozd2 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Jelka(62, 44),
            new Tretja.Bukev(70, 15),
            new Tretja.Jelka(51, 77),
            new Tretja.Smreka(18, 3),
            new Tretja.Hrast(40, 91),
            new Tretja.Bor(39, 68),
            new Tretja.Hrast(87, 77),
            new Tretja.Bukev(82, 67),
            new Tretja.Bor(90, 85),
            new Tretja.Bukev(19, 65),
            new Tretja.Smreka(99, 76),
            new Tretja.Hrast(38, 76),
            new Tretja.Jelka(29, 70),
            new Tretja.Breza(77, 91),
            new Tretja.Smreka(40, 26),
        });
        System.out.println(gozd2.jeListnat());

        Tretja.Gozd gozd3 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(43, 82),
            new Tretja.Breza(62, 87),
            new Tretja.Bukev(34, 17),
            new Tretja.Bukev(21, 69),
            new Tretja.Breza(97, 87),
            new Tretja.Bukev(66, 83),
            new Tretja.Hrast(49, 17),
            new Tretja.Bukev(77, 94),
            new Tretja.Breza(18, 17),
            new Tretja.Hrast(49, 66),
            new Tretja.Bukev(45, 54),
            new Tretja.Breza(62, 16),
            new Tretja.Hrast(74, 85),
        });
        System.out.println(gozd3.jeListnat());

        Tretja.Gozd gozd4 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(25, 5),
            new Tretja.Breza(55, 57),
            new Tretja.Hrast(67, 58),
            new Tretja.Breza(47, 83),
            new Tretja.Breza(42, 27),
            new Tretja.Bukev(45, 91),
            new Tretja.Breza(39, 89),
            new Tretja.Breza(32, 62),
            new Tretja.Breza(0, 45),
            new Tretja.Breza(91, 89),
            new Tretja.Hrast(36, 64),
            new Tretja.Breza(40, 80),
            new Tretja.Breza(92, 32),
            new Tretja.Bukev(98, 16),
            new Tretja.Hrast(38, 52),
        });
        System.out.println(gozd4.jeListnat());

        Tretja.Gozd gozd5 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(14, 99),
            new Tretja.Breza(63, 55),
        });
        System.out.println(gozd5.jeListnat());

        Tretja.Gozd gozd6 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(72, 68),
            new Tretja.Breza(4, 66),
            new Tretja.Bukev(43, 68),
            new Tretja.Breza(55, 82),
            new Tretja.Hrast(35, 90),
            new Tretja.Hrast(75, 94),
            new Tretja.Hrast(77, 2),
            new Tretja.Bukev(20, 14),
            new Tretja.Breza(11, 86),
            new Tretja.Hrast(11, 10),
            new Tretja.Bukev(10, 81),
            new Tretja.Hrast(54, 50),
            new Tretja.Breza(92, 53),
            new Tretja.Breza(45, 12),
            new Tretja.Hrast(81, 54),
            new Tretja.Breza(59, 15),
            new Tretja.Breza(13, 88),
            new Tretja.Breza(14, 59),
            new Tretja.Bukev(85, 15),
        });
        System.out.println(gozd6.jeListnat());

        Tretja.Gozd gozd7 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(62, 28),
            new Tretja.Hrast(96, 26),
            new Tretja.Bukev(29, 75),
            new Tretja.Bukev(29, 15),
            new Tretja.Breza(18, 95),
            new Tretja.Bukev(34, 44),
            new Tretja.Hrast(3, 10),
            new Tretja.Breza(88, 77),
            new Tretja.Bukev(8, 60),
        });
        System.out.println(gozd7.jeListnat());

        Tretja.Gozd gozd8 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(48, 74),
        });
        System.out.println(gozd8.jeListnat());

        Tretja.Gozd gozd9 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(74, 14),
            new Tretja.Bukev(89, 95),
            new Tretja.Hrast(24, 59),
            new Tretja.Breza(96, 4),
            new Tretja.Bukev(91, 45),
            new Tretja.Breza(96, 16),
        });
        System.out.println(gozd9.jeListnat());

    }
}
