
public class Test45 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {60286, 72525, 450, 10814, 13760, 24360, 18503, 9787, 72525, 82484, 13760, 8590, 18503, 59317, 72525, 8590, 24360, 52453, 29176, 7147, 514, 59317, 9787, 13760, 17545, 18503, 8590, 24360, 29176, 31043, 10814, 514, 19552, 8590, 8211, 24360, 77646, 29176, 60286, 18503, 72525, 7147, 19406, 19406, 7147};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 77));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 102));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 110));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 114));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 158));
    }
}
