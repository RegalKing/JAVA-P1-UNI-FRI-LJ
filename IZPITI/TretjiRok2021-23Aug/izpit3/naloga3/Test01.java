
public class Test01 {
    
    private static final String NO = "nemski ovcar";
    private static final String IS = "irski seter";

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[13];
        psi[0] = new Tretja.RodovniskiPes(NO, null, null);
        psi[1] = new Tretja.RodovniskiPes(NO, null, null);
        psi[2] = new Tretja.RodovniskiPes(NO, psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes(NO, null, null);
        psi[4] = new Tretja.RodovniskiPes(NO, psi[2], psi[3]);
        psi[5] = new Tretja.RodovniskiPes(NO, null, null);
        psi[6] = new Tretja.RodovniskiPes(IS, null, null);
        psi[7] = new Tretja.RodovniskiPes(NO, null, null);
        psi[8] = new Tretja.RodovniskiPes(NO, psi[5], psi[6]);
        psi[9] = new Tretja.RodovniskiPes(NO, psi[5], psi[7]);
        psi[10] = new Tretja.RodovniskiPes(NO, psi[4], psi[8]);
        psi[11] = new Tretja.RodovniskiPes(NO, psi[4], psi[9]);
        psi[12] = new Tretja.RodovniskiPes(IS, psi[4], psi[9]);

        System.out.println(Tretja.prestej(psi, NO));
        System.out.println(Tretja.prestej(psi, IS));
    }
}
