
public class Test22 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {16, 4, 40, 53, 52, 96, 40, 38, 16, 4, 40, 52, 53, 53, 38, 38, 52, 70, 12, 53, 70, 96};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 17));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 101));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 136));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 147));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 191));
    }
}
