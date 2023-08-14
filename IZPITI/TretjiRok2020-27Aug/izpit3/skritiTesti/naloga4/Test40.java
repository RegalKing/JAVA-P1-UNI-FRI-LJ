
public class Test40 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-761, -14, 14, -564, -761, -62, 14, -62, -429, -761, -897, 761, 205, -14, -496, 14, 650, -62, -94, -340, -525, -340, -429, -218, 94, -218, 82, -218, -205, -62, -960, -761, 94, -525, 392, -39, -897, -82, 205, 491};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 32));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 82));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 115));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 142));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 188));
    }
}
