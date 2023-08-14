
public class Test32 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-281, -760, 538, 760, 281, -65, 506, -276, 87, 760, -65, -538, -904, 506, -159, 281, 276, -538, 65, -571, 493, 257, 493, 760, -493, 372, -87, 276, 159, -538, 493, 506};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 2));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 36));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 80));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 82));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 172));
    }
}
