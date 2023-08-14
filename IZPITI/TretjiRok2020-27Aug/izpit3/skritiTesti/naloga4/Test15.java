
public class Test15 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {5, 1, 1, 5, 1, 5, 1, 2, 5, 3, 2, 3, 9, 3, 3};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 35));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 62));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 130));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 176));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 187));
    }
}
