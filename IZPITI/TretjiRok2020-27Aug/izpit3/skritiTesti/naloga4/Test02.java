
public class Test02 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {37755393, 37755393};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 35));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 96));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 120));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 127));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 145));
    }
}
