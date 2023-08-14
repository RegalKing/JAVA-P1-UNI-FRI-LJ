
public class Test03 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {3970018, 3970018, 3970018};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 62));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 148));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 162));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 175));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 193));
    }
}
