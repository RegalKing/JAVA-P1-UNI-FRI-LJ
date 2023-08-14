
public class Test04 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-8, -6, -6, -6};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 29));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 30));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 93));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 98));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 146));
    }
}
