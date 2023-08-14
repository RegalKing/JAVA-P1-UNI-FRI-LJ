
public class Test03 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {5, -6, 1263, -6, 1263, -42, -6, 1263, 5, 1263};

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
        MojGenerator gen = new MojGenerator();
        System.out.println(Cetrta.stKlicev(gen, 1));
        System.out.println(Cetrta.stKlicev(gen, 2));
        System.out.println(Cetrta.stKlicev(gen, 4));
        System.out.println(Cetrta.stKlicev(gen, 5));
        System.out.println(Cetrta.stKlicev(gen, 10));
        System.out.println(Cetrta.stKlicev(gen, 42));
        System.out.println(Cetrta.stKlicev(gen, 975));
    }
}
