
public class Test49 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 102);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 591);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 913);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 200);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 417);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 290);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 119);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 284);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 992);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 948);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 128);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 63);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 62);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 726);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 476);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 487);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 215);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 557);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 186);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 452);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 550);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 324);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 28);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 53);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 884);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o15, o10, o21, o23, o0});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o10, o23});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o21, o10, o15, o0, o23});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o9});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o18, o2, o13, o5});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o21, o10, o23, o15, o0});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o12, o0});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o22, o19, o21});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o12, o0});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o9});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o14, o15, o24, o12});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o21, o22, o19});

        System.out.println(p8.jePermutacijaOd(p2));
        System.out.println(p3.jePermutacijaOd(p5));
        System.out.println(p5.jePermutacijaOd(p2));
        System.out.println(p11.jePermutacijaOd(p6));
        System.out.println(p1.jePermutacijaOd(p5));
        System.out.println(p8.jePermutacijaOd(p5));
        System.out.println(p4.jePermutacijaOd(p8));
        System.out.println(p6.jePermutacijaOd(p1));
        System.out.println(p9.jePermutacijaOd(p10));
        System.out.println(p1.jePermutacijaOd(p7));
        System.out.println(p8.jePermutacijaOd(p2));
        System.out.println(p11.jePermutacijaOd(p10));
        System.out.println(p1.jePermutacijaOd(p2));
        System.out.println(p1.jePermutacijaOd(p5));
        System.out.println(p10.jePermutacijaOd(p0));
        System.out.println(p1.jePermutacijaOd(p2));
        System.out.println(p11.jePermutacijaOd(p6));
        System.out.println(p0.jePermutacijaOd(p5));
        System.out.println(p8.jePermutacijaOd(p5));
        System.out.println(p2.jePermutacijaOd(p1));
        System.out.println(p11.jePermutacijaOd(p9));
        System.out.println(p3.jePermutacijaOd(p9));
        System.out.println(p8.jePermutacijaOd(p3));
        System.out.println(p3.jePermutacijaOd(p1));
        System.out.println(p10.jePermutacijaOd(p4));
        System.out.println(p7.jePermutacijaOd(p9));
        System.out.println(p7.jePermutacijaOd(p4));
        System.out.println(p7.jePermutacijaOd(p6));
        System.out.println(p4.jePermutacijaOd(p9));
        System.out.println(p11.jePermutacijaOd(p7));
        System.out.println(p2.jePermutacijaOd(p1));
        System.out.println(p10.jePermutacijaOd(p5));
        System.out.println(p9.jePermutacijaOd(p11));
        System.out.println(p2.jePermutacijaOd(p6));
        System.out.println(p0.jePermutacijaOd(p3));
        System.out.println(p0.jePermutacijaOd(p11));
        System.out.println(p6.jePermutacijaOd(p4));
        System.out.println(p5.jePermutacijaOd(p4));
        System.out.println(p3.jePermutacijaOd(p5));
        System.out.println(p0.jePermutacijaOd(p2));
        System.out.println(p2.jePermutacijaOd(p6));
        System.out.println(p8.jePermutacijaOd(p11));
        System.out.println(p11.jePermutacijaOd(p2));
        System.out.println(p10.jePermutacijaOd(p1));
        System.out.println(p11.jePermutacijaOd(p8));
        System.out.println(p8.jePermutacijaOd(p10));
        System.out.println(p7.jePermutacijaOd(p11));
        System.out.println(p8.jePermutacijaOd(p7));
        System.out.println(p8.jePermutacijaOd(p10));
        System.out.println(p1.jePermutacijaOd(p11));
        System.out.println(p5.jePermutacijaOd(p10));
        System.out.println(p7.jePermutacijaOd(p4));
        System.out.println(p6.jePermutacijaOd(p10));
        System.out.println(p1.jePermutacijaOd(p0));
        System.out.println(p1.jePermutacijaOd(p6));
        System.out.println(p6.jePermutacijaOd(p1));
        System.out.println(p5.jePermutacijaOd(p1));
        System.out.println(p10.jePermutacijaOd(p9));
        System.out.println(p1.jePermutacijaOd(p11));
        System.out.println(p7.jePermutacijaOd(p11));
        System.out.println(p6.jePermutacijaOd(p0));
        System.out.println(p10.jePermutacijaOd(p2));
        System.out.println(p7.jePermutacijaOd(p11));
        System.out.println(p9.jePermutacijaOd(p4));
        System.out.println(p3.jePermutacijaOd(p6));
        System.out.println(p11.jePermutacijaOd(p6));
        System.out.println(p7.jePermutacijaOd(p11));
        System.out.println(p3.jePermutacijaOd(p0));
        System.out.println(p5.jePermutacijaOd(p3));
        System.out.println(p10.jePermutacijaOd(p3));
    }
}