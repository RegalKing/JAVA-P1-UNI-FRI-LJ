
public class Test03 {

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

        Tretja.Delavnica delavnica = new Tretja.Delavnica(
            new Tretja.Delavec[]{
                new Tretja.Delavec("Ana Arko",       50),
                new Tretja.Delavec("Bojan Bizjak",   60),
                new Tretja.Delavec("Cvetka Cevc",    20),
                new Tretja.Delavec("Drago Devetak",  10),
                new Tretja.Delavec("Eva Ermenc",     30),
                new Tretja.Delavec("Franci Flander", 40),
            }
        );

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p1, p2, p3, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p5}));
    }
}
