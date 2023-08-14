
public class Test17 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {98381244, 69996450, 80821530, 66873026, 78596066, 80821530, 80821530, 98381244, 206338, 66873026, 65580394, 206338, 65580394, 98381244, 65580394, 70751671, 98381244};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 14));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 59));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 83));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 193));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 198));
    }
}
