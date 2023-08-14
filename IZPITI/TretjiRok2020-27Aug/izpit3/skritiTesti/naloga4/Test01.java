
public class Test01 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {2676};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 64));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 155));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 161));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 175));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 191));
    }
}
