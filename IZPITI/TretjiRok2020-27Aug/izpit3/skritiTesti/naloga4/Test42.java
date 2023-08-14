
public class Test42 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {978998785, 387778497, 577009790, 749288007, 556201667, 830270391, 626835695, 556201667, 830270391, 229982695, 368671561, 368671561, 281797978, 368671561, 626835695, 765257845, 830270391, 387778497, 288530202, 387778497, 577009790, 288530202, 368671561, 577009790, 281797978, 626835695, 387778497, 368671561, 387778497, 320715918, 749288007, 288530202, 558645804, 556201667, 830270391, 335061150, 765257845, 978998785, 229982695, 558645804, 765257845, 288530202};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 29));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 41));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 48));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 159));
    }
}
