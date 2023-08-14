
public class Test35 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {78506583, 78506583, 74424886, 79220726, 34248775, 33173809, 79345203, 86535553, 34074646, 45369077, 85757569, 34248775, 34074646, 74424886, 47978651, 47978651, 78506583, 79345203, 47978651, 29337867, 3106654, 85757569, 78506583, 3106654, 34074646, 79220726, 10523873, 86535553, 33173809, 74424886, 47978651, 61912501, 29337867, 74424886, 45369077};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 7));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 10));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 13));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 15));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 85));
    }
}
