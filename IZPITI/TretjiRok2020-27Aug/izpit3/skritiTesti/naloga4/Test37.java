
public class Test37 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {46750, 460471, 21963, 408932, 182918, 523433, 155115, 989432, 989432, 594965, 594965, 408932, 453473, 531432, 927199, 583611, 46750, 101857, 182918, 460471, 645741, 531432, 21963, 182918, 531432, 408932, 155115, 927199, 21963, 645741, 460471, 101857, 371323, 21963, 645741, 989432, 645741};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 8));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 28));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 77));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 150));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 156));
    }
}
