
public class Test05 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {996883132, 996883132, 996883132, 717017736, 996883132};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 11));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 20));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 85));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 107));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 177));
    }
}
