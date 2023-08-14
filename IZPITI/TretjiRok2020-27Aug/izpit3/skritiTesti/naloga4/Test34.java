
public class Test34 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {2475394, 6466970, 3042568, 673922, 4290777, 5895025, 7674335, 9608587, 577777, 960389, 4290777, 5895025, 9058159, 4290777, 5807469, 6366466, 7674335, 577777, 673922, 960389, 960389, 7470612, 5895025, 3039267, 6366466, 889291, 2475394, 2475394, 5895025, 4290777, 6366466, 577777, 7674335, 7674335};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 19));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 24));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 110));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 193));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 196));
    }
}
