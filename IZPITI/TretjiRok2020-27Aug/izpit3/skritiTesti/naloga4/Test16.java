
public class Test16 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {291981, 335761, 346021, 161017, -336619, -161017, 272193, 943657, 335761, -335761, 943657, -272193, 272193, 346021, 287134, -335761};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 33));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 137));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 155));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 178));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 182));
    }
}
