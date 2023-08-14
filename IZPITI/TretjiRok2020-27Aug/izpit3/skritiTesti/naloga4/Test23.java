
public class Test23 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {26005, 97857, 77014, 69659, 11406, 97857, 72789, 80466, 22138, 97857, 10723, 26005, 80466, 97857, 10723, 11406, 77014, 10723, 97857, 69659, 22138, 72789, 22138};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 9));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 30));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 44));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 83));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 109));
    }
}
