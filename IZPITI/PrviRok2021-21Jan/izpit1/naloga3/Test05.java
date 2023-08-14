
public class Test05 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 50);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 20);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 30);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 10);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o0, o1, o2});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o1, o0});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o1, o2});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o2, o0, o3, o1});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o1, o3});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o3, o1, o0, o2});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o1, o2});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o2, o0, o1});

        System.out.println(p0.jePermutacijaOd(p1));
        System.out.println(p1.jePermutacijaOd(p0));
        System.out.println(p0.jePermutacijaOd(p4));
        System.out.println(p4.jePermutacijaOd(p0));
        System.out.println(p5.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p5));

        System.out.println(p0.jePermutacijaOd(p8));
        System.out.println(p2.jePermutacijaOd(p7));
        System.out.println(p4.jePermutacijaOd(p6));
        System.out.println(p3.jePermutacijaOd(p3));
        System.out.println(p3.jePermutacijaOd("p3"));
    }
}
