
public class Test14 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {9, 8, 9, 8, 2, 2, 8, 3, 7, 7, 7, 7, 9, 8};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 33));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 134));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 153));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 185));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 188));
    }
}
