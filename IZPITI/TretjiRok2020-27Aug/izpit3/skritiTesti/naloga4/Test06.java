
public class Test06 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {2959, 4064, 2959, 4064, 7718, 4064};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 50));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 116));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 139));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 155));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 156));
    }
}
