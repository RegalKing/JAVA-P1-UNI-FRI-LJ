
public class Test03 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[7];
        zivali[0] = new Tretja.Macka();
        zivali[1] = new Tretja.RodovniskiPes("bernski plansar", null, null);
        zivali[2] = new Tretja.Pes();
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.Macka();
        zivali[5] = new Tretja.RodovniskiPes("havanski bison", null, null);
        zivali[6] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
