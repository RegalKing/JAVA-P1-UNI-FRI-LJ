
public class Test19 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {697016, 805236, 271605, 419271, 697016, 978721, 123464, 817769, 978721, 697016, 316302, 805236, 978721, 697016, 978721, 978721, 316302, 271605, 817769};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 5));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 23));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 66));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 77));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 96));
    }
}
