
public class Test36 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-641, -612, 641, 610, -306, -612, 306, -830, 665, 612, -206, -690, -206, -306, -206, -808, 306, 690, 480, 332, 641, -961, -552, -332, -610, -492, -995, 961, -641, -306, -830, -306, 480, 552, 130, 610};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 121));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 167));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 183));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 184));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 187));
    }
}
