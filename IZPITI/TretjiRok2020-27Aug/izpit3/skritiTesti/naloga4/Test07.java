
public class Test07 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {75848, 75848, 62887, 62887, 88032, 88032, 62887};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 56));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 63));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 151));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 163));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 178));
    }
}
