
public class Test11 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {48, 40, 60, 60, 60, 29, 60, 56, 56, 29, 60};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 12));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 25));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 44));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 85));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 122));
    }
}
