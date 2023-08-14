
public class Test33 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {718086, 248605, 518998, 615686, 597880, 397392, 272861, 391416, 930330, 391416, 87474, 597880, 243850, 248605, 87474, 397392, 397392, 615686, 930330, 597880, 685573, 597880, 248605, 397392, 597880, 718086, 597880, 831120, 718086, 272861, 391416, 930330, 831120};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 3));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 19));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 37));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 97));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 110));
    }
}
