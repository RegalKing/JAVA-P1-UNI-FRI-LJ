
public class Test28 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-624, 624, 372, -624, 7, -748, -664, -624, 664, -372, 429, -7, -664, 588, -372, -619, 372, 893, -624, 664, 619, -619, -189, 189, -619, -429, -189, -619};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 30));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 85));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 112));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 115));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 181));
    }
}
