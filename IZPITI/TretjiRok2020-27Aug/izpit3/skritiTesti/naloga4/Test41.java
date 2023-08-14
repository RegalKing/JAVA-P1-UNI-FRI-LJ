
public class Test41 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {811004533, 823037085, 761889037, 19450913, 311356050, 761889037, 487047366, 68624052, 771229348, 618254804, 547887003, 104472175, 104472175, 761889037, 487047366, 930340823, 210160312, 823037085, 662968335, 19450913, 930340823, 210160312, 761889037, 328603850, 930340823, 487047366, 761889037, 761889037, 930340823, 618254804, 104472175, 662968335, 771229348, 351913839, 104472175, 487047366, 936381968, 823953618, 328603850, 936381968, 823037085};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 63));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 103));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 131));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 191));
    }
}
