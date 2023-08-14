
public class Test17 {

    public static void main(String[] args) {
        Tretja.Gozd gozd0 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(14, 3),
            new Tretja.Breza(71, 99),
            new Tretja.Hrast(84, 12),
            new Tretja.Breza(28, 85),
            new Tretja.Hrast(19, 33),
            new Tretja.Hrast(18, 81),
            new Tretja.Hrast(13, 75),
            new Tretja.Breza(99, 17),
            new Tretja.Bukev(20, 82),
            new Tretja.Hrast(61, 52),
            new Tretja.Breza(50, 36),
            new Tretja.Hrast(44, 52),
            new Tretja.Breza(43, 49),
            new Tretja.Breza(31, 82),
            new Tretja.Breza(82, 16),
            new Tretja.Hrast(42, 12),
        });
        System.out.println(gozd0.jeListnat());

        Tretja.Gozd gozd1 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(79, 70),
        });
        System.out.println(gozd1.jeListnat());

        Tretja.Gozd gozd2 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(83, 66),
            new Tretja.Jelka(21, 93),
            new Tretja.Smreka(18, 69),
            new Tretja.Smreka(57, 31),
            new Tretja.Jelka(99, 84),
            new Tretja.Bor(1, 54),
        });
        System.out.println(gozd2.jeListnat());

        Tretja.Gozd gozd3 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bor(0, 34),
            new Tretja.Smreka(47, 84),
            new Tretja.Hrast(1, 67),
            new Tretja.Breza(28, 33),
        });
        System.out.println(gozd3.jeListnat());

        Tretja.Gozd gozd4 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(54, 45),
            new Tretja.Jelka(34, 88),
            new Tretja.Hrast(91, 13),
            new Tretja.Smreka(44, 45),
            new Tretja.Smreka(87, 19),
            new Tretja.Bor(79, 11),
            new Tretja.Bor(41, 95),
            new Tretja.Bor(62, 46),
            new Tretja.Bor(56, 54),
            new Tretja.Breza(8, 12),
            new Tretja.Smreka(65, 70),
            new Tretja.Bukev(66, 8),
            new Tretja.Jelka(82, 50),
            new Tretja.Jelka(66, 38),
        });
        System.out.println(gozd4.jeListnat());

        Tretja.Gozd gozd5 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(27, 90),
            new Tretja.Breza(24, 81),
            new Tretja.Breza(56, 92),
            new Tretja.Breza(63, 99),
            new Tretja.Breza(28, 48),
        });
        System.out.println(gozd5.jeListnat());

        Tretja.Gozd gozd6 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Jelka(11, 37),
        });
        System.out.println(gozd6.jeListnat());

        Tretja.Gozd gozd7 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Jelka(78, 79),
            new Tretja.Bukev(5, 46),
            new Tretja.Bukev(23, 50),
            new Tretja.Jelka(52, 50),
        });
        System.out.println(gozd7.jeListnat());

        Tretja.Gozd gozd8 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(96, 31),
            new Tretja.Bukev(71, 72),
            new Tretja.Smreka(3, 98),
            new Tretja.Bukev(8, 6),
            new Tretja.Bukev(85, 34),
            new Tretja.Bukev(19, 3),
            new Tretja.Jelka(4, 83),
        });
        System.out.println(gozd8.jeListnat());

        Tretja.Gozd gozd9 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(1, 76),
            new Tretja.Hrast(27, 91),
            new Tretja.Hrast(30, 24),
            new Tretja.Bor(2, 61),
            new Tretja.Breza(90, 68),
            new Tretja.Smreka(33, 53),
            new Tretja.Bukev(35, 43),
            new Tretja.Breza(29, 12),
            new Tretja.Breza(37, 20),
            new Tretja.Bukev(81, 31),
        });
        System.out.println(gozd9.jeListnat());

    }
}
