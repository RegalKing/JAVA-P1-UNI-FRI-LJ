
public class Test01 {

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 3));
    }
}
