
public class Test47 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {771415, 727222, 656770, 995359, 995359, 136032, 670753, 794610, 106223, 597395, 618744, 800244, 670753, 535871, 597395, 106223, 414245, 535871, 559403, 404638, 792201, 136032, 404638, 792201, 136032, 618744, 663411, 727222, 379904, 404638, 727222, 278309, 463907, 463907, 792201, 800244, 404638, 597395, 800244, 727222, 663411, 559403, 995359, 670753, 463907, 794610, 278309};

        public MojGenerator() {
            this.ix = 0;
        }

        @Override
        public int naslednji() {
            int rezultat = T[this.ix];
            this.ix = (this.ix + 1) % T.length;
            return rezultat;
        }
    }

    public static void main(String[] args) {
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 21));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 68));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 88));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 122));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 125));
    }
}
