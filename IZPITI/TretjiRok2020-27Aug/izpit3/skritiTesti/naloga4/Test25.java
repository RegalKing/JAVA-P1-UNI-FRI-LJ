
public class Test25 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {41088594, 29152859, 29152859, 9686086, 56949077, 62787563, 5383623, 81656519, 5383623, 4603291, 81656519, 93972615, 58125303, 93972615, 81656519, 4603291, 17078231, 80349989, 9686086, 62787563, 4603291, 9686086, 9686086, 41088594, 93972615};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 15));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 22));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 48));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 89));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 93));
    }
}
