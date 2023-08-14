
public class Test31 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {336, 244, 741, 985, 344, 336, 83, 985, 591, 670, 540, 786, 219, 761, 741, 219, 336, 219, 591, 591, 336, 844, 741, 149, 985, 336, 761, 670, 786, 741, 874};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 63));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 73));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 92));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 175));
    }
}
