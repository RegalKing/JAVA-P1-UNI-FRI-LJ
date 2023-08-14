
public class Test12 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {52, -24, 13, -94, 52, 52, -52, -79, 79, -24, 94, 24};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 22));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 56));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 118));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 141));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 145));
    }
}
