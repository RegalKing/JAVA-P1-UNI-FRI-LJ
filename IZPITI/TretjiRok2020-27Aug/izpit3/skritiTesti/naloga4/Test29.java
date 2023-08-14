
public class Test29 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {43, 39, 51, 51, 51, 76, 77, 76, 31, 43, 31, 17, 39, 39, 17, 76, 37, 43, 37, 39, 51, 25, 3, 37, 45, 17, 37, 57, 31};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 6));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 15));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 114));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 115));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 119));
    }
}
