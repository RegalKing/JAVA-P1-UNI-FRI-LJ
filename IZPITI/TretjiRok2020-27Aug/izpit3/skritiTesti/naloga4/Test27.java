
public class Test27 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {52086166, 8922870, 65127816, 88050592, 85676545, 53662539, 53662539, 91345754, 3422472, 65127816, 44072713, 3422472, 71906794, 71906794, 69890754, 53662539, 53662539, 69890754, 52086166, 88050592, 91345754, 69890754, 88050592, 91345754, 69890754, 91345754, 20456520};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 57));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 92));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 137));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 154));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 160));
    }
}
