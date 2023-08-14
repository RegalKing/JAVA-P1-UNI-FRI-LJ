
public class Test32 {

    public static void main(String[] args) {
        Tretja.Gozd gozd0 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(47, 77),
            new Tretja.Bukev(85, 69),
            new Tretja.Bukev(24, 65),
            new Tretja.Smreka(0, 16),
            new Tretja.Smreka(35, 56),
            new Tretja.Hrast(78, 2),
            new Tretja.Smreka(23, 39),
            new Tretja.Smreka(75, 32),
            new Tretja.Bor(90, 74),
            new Tretja.Smreka(92, 86),
            new Tretja.Breza(21, 31),
            new Tretja.Jelka(12, 40),
        });
        System.out.println(gozd0.jeListnat());

        Tretja.Gozd gozd1 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bor(7, 28),
            new Tretja.Bor(60, 44),
            new Tretja.Breza(28, 75),
            new Tretja.Jelka(80, 60),
            new Tretja.Hrast(28, 18),
            new Tretja.Hrast(99, 90),
            new Tretja.Smreka(79, 13),
            new Tretja.Breza(98, 62),
        });
        System.out.println(gozd1.jeListnat());

        Tretja.Gozd gozd2 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(42, 51),
            new Tretja.Bukev(86, 78),
            new Tretja.Breza(43, 57),
            new Tretja.Hrast(18, 81),
            new Tretja.Bukev(3, 95),
            new Tretja.Hrast(4, 96),
            new Tretja.Bukev(10, 64),
            new Tretja.Bukev(92, 80),
            new Tretja.Hrast(48, 99),
            new Tretja.Bukev(54, 22),
            new Tretja.Hrast(40, 53),
            new Tretja.Breza(16, 76),
        });
        System.out.println(gozd2.jeListnat());

        Tretja.Gozd gozd3 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(29, 36),
            new Tretja.Breza(23, 99),
            new Tretja.Breza(72, 59),
            new Tretja.Breza(68, 69),
            new Tretja.Bukev(44, 50),
            new Tretja.Bukev(58, 61),
            new Tretja.Breza(5, 68),
            new Tretja.Breza(21, 86),
            new Tretja.Hrast(59, 18),
            new Tretja.Hrast(60, 83),
            new Tretja.Bukev(56, 75),
            new Tretja.Hrast(47, 58),
            new Tretja.Hrast(15, 81),
            new Tretja.Hrast(57, 71),
            new Tretja.Bukev(72, 71),
            new Tretja.Breza(82, 57),
            new Tretja.Bukev(89, 95),
            new Tretja.Hrast(98, 29),
        });
        System.out.println(gozd3.jeListnat());

        Tretja.Gozd gozd4 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(79, 71),
            new Tretja.Jelka(41, 78),
            new Tretja.Bukev(91, 39),
            new Tretja.Hrast(91, 34),
            new Tretja.Jelka(56, 44),
            new Tretja.Hrast(93, 91),
        });
        System.out.println(gozd4.jeListnat());

        Tretja.Gozd gozd5 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(3, 16),
            new Tretja.Hrast(29, 54),
            new Tretja.Hrast(45, 87),
            new Tretja.Hrast(62, 76),
            new Tretja.Bukev(29, 72),
            new Tretja.Smreka(17, 44),
            new Tretja.Breza(39, 97),
            new Tretja.Bor(68, 12),
            new Tretja.Smreka(14, 82),
            new Tretja.Bukev(89, 25),
            new Tretja.Breza(77, 90),
            new Tretja.Bukev(51, 87),
            new Tretja.Breza(94, 86),
            new Tretja.Jelka(67, 16),
            new Tretja.Breza(57, 33),
            new Tretja.Breza(95, 26),
            new Tretja.Smreka(68, 32),
            new Tretja.Smreka(99, 35),
            new Tretja.Hrast(68, 90),
        });
        System.out.println(gozd5.jeListnat());

        Tretja.Gozd gozd6 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(55, 30),
            new Tretja.Smreka(54, 55),
            new Tretja.Bor(59, 8),
            new Tretja.Bor(42, 43),
            new Tretja.Hrast(82, 94),
            new Tretja.Hrast(61, 21),
            new Tretja.Smreka(76, 37),
            new Tretja.Breza(49, 19),
        });
        System.out.println(gozd6.jeListnat());

        Tretja.Gozd gozd7 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bor(57, 69),
        });
        System.out.println(gozd7.jeListnat());

        Tretja.Gozd gozd8 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(18, 54),
            new Tretja.Bukev(12, 39),
            new Tretja.Bukev(98, 37),
        });
        System.out.println(gozd8.jeListnat());

        Tretja.Gozd gozd9 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(2, 81),
        });
        System.out.println(gozd9.jeListnat());

    }
}
