
public class Test48 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {361844160, -886253982, 876597809, 704151214, 59505468, 589219670, -886253982, -602078119, -843889187, 84730136, 72917165, -524987221, 886253982, -593836131, -602078119, -645729512, -84730136, 645729512, 361844160, -361844160, 886253982, -133092396, 645729512, 361844160, -884679443, -361844160, -84730136, -233733945, -84730136, -843889187, -876597809, -423494906, -59505468, -458025169, 589219670, 233733945, 876597809, -161092224, -704151214, -133092396, 233733945, -645729512, 375968719, 161092224, -704151214, 161092224, -886253982, -591677184};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 29));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 54));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 130));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 162));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 178));
    }
}
