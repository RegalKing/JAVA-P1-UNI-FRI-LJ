
public class Test40 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 558);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 450);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 608);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 607);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 446);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 651);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 706);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 128);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 841);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 119);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 645);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 776);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 794);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 575);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 683);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 496);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 273);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 521);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 302);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 640);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 148);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 329);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 853);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 43);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 987);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 933);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 914);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 772);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o12, o17, o26, o20, o1, o11});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o7, o26});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o3, o5, o8, o7});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o7, o5, o3, o8});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o16, o12, o17});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o19, o23, o24, o22, o15, o4, o10, o2});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o20, o6, o12, o9, o22, o11, o4});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o11, o12, o9, o22, o20, o6, o4});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o19, o27, o7, o3, o10, o0, o24, o26, o15});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o17, o4, o13, o8, o23, o26});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o5, o7, o8, o3});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o18});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o4, o6, o22, o12, o20, o9, o11});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o20, o19, o5, o27});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o10, o19, o4, o2, o24, o23, o15, o22});
        Tretja.Projekt p15 = new Tretja.Projekt("p15", new Tretja.Opravilo[]{o10, o3, o6});

        System.out.println(p13.jePermutacijaOd(p1));
        System.out.println(p14.jePermutacijaOd(p12));
        System.out.println(p13.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p0));
        System.out.println(p15.jePermutacijaOd(p14));
        System.out.println(p3.jePermutacijaOd(p2));
        System.out.println(p14.jePermutacijaOd(p11));
        System.out.println(p1.jePermutacijaOd(p7));
        System.out.println(p9.jePermutacijaOd(p3));
        System.out.println(p0.jePermutacijaOd(p9));
        System.out.println(p4.jePermutacijaOd(p7));
        System.out.println(p8.jePermutacijaOd(p14));
        System.out.println(p10.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p11));
        System.out.println(p4.jePermutacijaOd(p8));
        System.out.println(p0.jePermutacijaOd(p12));
        System.out.println(p12.jePermutacijaOd(p15));
        System.out.println(p2.jePermutacijaOd(p11));
        System.out.println(p15.jePermutacijaOd(p6));
        System.out.println(p2.jePermutacijaOd(p10));
        System.out.println(p15.jePermutacijaOd(p14));
        System.out.println(p7.jePermutacijaOd(p4));
        System.out.println(p8.jePermutacijaOd(p4));
        System.out.println(p15.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p15));
        System.out.println(p10.jePermutacijaOd(p12));
        System.out.println(p12.jePermutacijaOd(p3));
        System.out.println(p6.jePermutacijaOd(p8));
        System.out.println(p14.jePermutacijaOd(p8));
        System.out.println(p7.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p14));
        System.out.println(p12.jePermutacijaOd(p5));
        System.out.println(p5.jePermutacijaOd(p14));
        System.out.println(p12.jePermutacijaOd(p14));
        System.out.println(p15.jePermutacijaOd(p12));
        System.out.println(p6.jePermutacijaOd(p7));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p12.jePermutacijaOd(p1));
        System.out.println(p13.jePermutacijaOd(p9));
        System.out.println(p6.jePermutacijaOd(p13));
        System.out.println(p13.jePermutacijaOd(p3));
        System.out.println(p5.jePermutacijaOd(p0));
        System.out.println(p6.jePermutacijaOd(p3));
        System.out.println(p6.jePermutacijaOd(p0));
        System.out.println(p15.jePermutacijaOd(p14));
        System.out.println(p8.jePermutacijaOd(p14));
        System.out.println(p3.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p10));
        System.out.println(p7.jePermutacijaOd(p6));
        System.out.println(p13.jePermutacijaOd(p15));
        System.out.println(p6.jePermutacijaOd(p0));
        System.out.println(p14.jePermutacijaOd(p10));
        System.out.println(p7.jePermutacijaOd(p15));
        System.out.println(p6.jePermutacijaOd(p14));
        System.out.println(p3.jePermutacijaOd(p9));
        System.out.println(p10.jePermutacijaOd(p14));
        System.out.println(p4.jePermutacijaOd(p11));
        System.out.println(p6.jePermutacijaOd(p8));
        System.out.println(p3.jePermutacijaOd(p6));
        System.out.println(p8.jePermutacijaOd(p4));
        System.out.println(p14.jePermutacijaOd(p11));
    }
}