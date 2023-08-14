
public class Test01 {

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

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
    }
}
