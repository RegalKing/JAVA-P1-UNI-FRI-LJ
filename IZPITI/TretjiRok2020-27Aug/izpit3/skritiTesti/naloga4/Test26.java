
public class Test26 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {78846, 16130, 62529, 44270, 73165, 59683, 95595, 6757, 62529, 44270, 44270, 16130, 80449, 78846, 73165, 59683, 76133, 95595, 16130, 44270, 16130, 646, 73165, 62529, 76133, 1655};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 18));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 21));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 70));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 102));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 167));
    }
}
