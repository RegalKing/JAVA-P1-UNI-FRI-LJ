
public class Test04 {

    public static void main(String[] args) {
        Tretja.Gozd gozd0 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(19, 67),
            new Tretja.Hrast(27, 24),
            new Tretja.Jelka(9, 67),
            new Tretja.Hrast(83, 88),
            new Tretja.Breza(95, 24),
            new Tretja.Bukev(20, 1),
            new Tretja.Smreka(99, 50),
            new Tretja.Smreka(68, 53),
            new Tretja.Hrast(51, 4),
            new Tretja.Smreka(15, 1),
            new Tretja.Hrast(0, 85),
            new Tretja.Jelka(96, 53),
        });
        System.out.println(gozd0.jeListnat());

        Tretja.Gozd gozd1 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(41, 24),
            new Tretja.Breza(6, 68),
        });
        System.out.println(gozd1.jeListnat());

        Tretja.Gozd gozd2 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(28, 29),
            new Tretja.Hrast(50, 58),
            new Tretja.Breza(78, 13),
            new Tretja.Bukev(73, 18),
            new Tretja.Breza(85, 39),
        });
        System.out.println(gozd2.jeListnat());

        Tretja.Gozd gozd3 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Smreka(58, 99),
            new Tretja.Bor(31, 16),
            new Tretja.Jelka(69, 76),
            new Tretja.Smreka(22, 31),
            new Tretja.Smreka(47, 11),
            new Tretja.Jelka(16, 9),
            new Tretja.Smreka(62, 17),
            new Tretja.Hrast(83, 45),
            new Tretja.Smreka(63, 34),
            new Tretja.Breza(33, 38),
            new Tretja.Smreka(98, 55),
        });
        System.out.println(gozd3.jeListnat());

        Tretja.Gozd gozd4 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(30, 98),
            new Tretja.Breza(63, 44),
            new Tretja.Bukev(36, 10),
            new Tretja.Breza(2, 39),
        });
        System.out.println(gozd4.jeListnat());

        Tretja.Gozd gozd5 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Jelka(29, 73),
            new Tretja.Bukev(9, 54),
            new Tretja.Smreka(79, 18),
            new Tretja.Hrast(40, 90),
            new Tretja.Breza(77, 55),
            new Tretja.Breza(60, 71),
            new Tretja.Jelka(40, 42),
            new Tretja.Breza(83, 37),
        });
        System.out.println(gozd5.jeListnat());

        Tretja.Gozd gozd6 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Bukev(55, 62),
            new Tretja.Breza(6, 25),
            new Tretja.Bukev(22, 44),
            new Tretja.Breza(61, 60),
            new Tretja.Hrast(29, 48),
            new Tretja.Bukev(99, 93),
            new Tretja.Hrast(45, 73),
        });
        System.out.println(gozd6.jeListnat());

        Tretja.Gozd gozd7 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Breza(42, 94),
            new Tretja.Breza(14, 24),
            new Tretja.Breza(63, 59),
            new Tretja.Bukev(81, 26),
            new Tretja.Bukev(80, 91),
        });
        System.out.println(gozd7.jeListnat());

        Tretja.Gozd gozd8 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(84, 95),
            new Tretja.Hrast(85, 98),
            new Tretja.Bor(13, 84),
            new Tretja.Breza(18, 81),
            new Tretja.Bukev(45, 96),
            new Tretja.Bukev(61, 99),
            new Tretja.Bor(44, 85),
            new Tretja.Bukev(39, 11),
            new Tretja.Bukev(60, 29),
            new Tretja.Bor(6, 64),
            new Tretja.Bor(79, 34),
            new Tretja.Smreka(31, 9),
            new Tretja.Breza(16, 78),
        });
        System.out.println(gozd8.jeListnat());

        Tretja.Gozd gozd9 = new Tretja.Gozd(new Tretja.Drevo[]{
            new Tretja.Hrast(97, 54),
            new Tretja.Bukev(65, 55),
            new Tretja.Breza(94, 66),
            new Tretja.Hrast(38, 92),
        });
        System.out.println(gozd9.jeListnat());

    }
}
