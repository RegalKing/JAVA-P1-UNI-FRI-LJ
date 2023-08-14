
public class Test18 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {881924180, 630945828, 630945828, 261443834, 881924180, 540903198, 630945828, 35167159, 261443834, 540903198, 93962668, 261443834, 881924180, 490464107, 630945828, 881924180, 630945828, 630945828};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 23));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 57));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 98));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 104));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 148));
    }
}
