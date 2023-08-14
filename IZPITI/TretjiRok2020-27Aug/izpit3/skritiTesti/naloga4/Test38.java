
public class Test38 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {8, 3, 5, 8, 3, 6, 3, 8, 7, 5, 9, 4, 8, 6, 3, 6, 6, 4, 6, 6, 5, 9, 7, 8, 2, 9, 6, 6, 8, 1, 6, 7, 5, 4, 9, 5, 3, 6};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 120));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 121));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 154));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 175));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 196));
    }
}
