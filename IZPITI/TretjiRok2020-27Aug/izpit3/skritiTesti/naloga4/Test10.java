
public class Test10 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {13362243, 41887030, 41300991, 91845543, 41300991, 91845543, 13362243, 81879361, 91845543, 13362243};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 38));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 72));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 135));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 140));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 150));
    }
}
