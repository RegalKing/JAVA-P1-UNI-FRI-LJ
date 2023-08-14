
/*
0 = NO
1 = NO
2 = NO(0, 1) = NO(NO, NO)
3 = NO
4 = NO(2, 3) = NO(NO(NO, NO), NO)
5 = NO
6 = IS
7 = NO
8 = NO(5, 6) = NO(NO, IS)
9 = NO(5, 7) = NO(NO, NO)
10 = NO(4, 8) = NO(NO(NO(NO, NO), NO), NO(NO, IS))
11 = NO(4, 9) = NO(NO(NO(NO, NO), NO), NO(NO, NO))
12 = IS(4, 9) = IS(NO(NO(NO, NO), NO), NO(NO, NO))
*/

public class Test05 {
    
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

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
