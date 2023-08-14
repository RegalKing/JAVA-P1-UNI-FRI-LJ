
public class Test24 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {586, 645, 586, 132, 673, 741, 680, 655, 591, 680, 49, -49, 645, -49, 655, -349, -741, -741, -132, -591, 586, 673, 645, 591};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 26));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 39));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 124));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 151));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 157));
    }
}
