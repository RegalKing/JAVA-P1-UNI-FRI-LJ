
public class Test09 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {21209, 34929, 10156, 21209, 21209, 21209, 10156, 34929, 10156};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 16));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 34));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 87));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 126));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 173));
    }
}
