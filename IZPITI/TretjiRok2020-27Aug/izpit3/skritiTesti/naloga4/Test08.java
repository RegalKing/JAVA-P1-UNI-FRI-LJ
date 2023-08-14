
public class Test08 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {-664043048, -764112508, -169488966, 764112508, -169488966, 764112508, -169488966, 169488966};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 31));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 54));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 95));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 144));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 192));
    }
}
