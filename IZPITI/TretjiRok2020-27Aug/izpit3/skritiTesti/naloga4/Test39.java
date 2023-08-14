
public class Test39 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {69, 358, 304, 786, 212, 672, 818, 328, 786, 778, 507, 358, 478, 212, 486, 358, 786, 930, 818, 304, 328, 385, 69, 358, 304, 849, 465, 786, 672, 69, 818, 69, 358, 778, 818, 818, 672, 304, 478};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 50));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 87));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 104));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 109));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 190));
    }
}
