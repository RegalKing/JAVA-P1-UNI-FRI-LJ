
public class Test21 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {8943, 7636, 2836, 9882, 6133, 2836, 9882, 9882, 8778, 1358, 8778, 1358, 1358, 8943, 4870, 8943, 8778, 8778, 8778, 2836, 8943};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 71));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 85));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 92));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 110));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 152));
    }
}
