
public class Test13 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {7927931, 2599935, 4710810, 2599935, 3419815, 4710810, 1232057, 3419815, 2599935, 3419815, 1232057, 7927931, 4710810};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 19));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 34));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 65));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 159));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 197));
    }
}
