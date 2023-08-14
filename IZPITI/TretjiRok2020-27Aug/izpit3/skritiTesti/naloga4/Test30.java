
public class Test30 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {795776243, 705000254, 509819903, 107629131, 927532009, 726733873, 927532009, 528258848, 795776243, 726733873, 429914421, 726733873, 795776243, 552548746, 429914421, 498170651, 429914421, 726733873, 509819903, 107629131, 107629131, 107629131, 509819903, 927532009, 795776243, 917431241, 498170651, 927532009, 9334656, 552548746};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 53));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 71));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 80));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 118));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 190));
    }
}
