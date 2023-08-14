
public class Test20 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {72915052, 72915052, -15163176, 72915052, 17877297, 72915052, -17877297, 88647327, 17877297, -63512320, -52920467, -71516061, 72915052, 17877297, -63512320, -42759961, -17877297, -88647327, 63512320, -63512320};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 21));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 42));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 137));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 157));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 195));
    }
}
