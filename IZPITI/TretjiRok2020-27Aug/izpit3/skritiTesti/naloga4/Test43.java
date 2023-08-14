
public class Test43 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {655876, 252505, 279717, 493743, 864617, 187037, 956214, 252505, 361859, 864617, 842740, 956214, 608322, 74632, 864617, 51421, 608322, 279717, 864617, 864617, 943492, 139706, 252505, 842740, 139706, 252505, 842740, 655876, 314130, 956214, 745048, 851534, 252505, 279717, 203921, 956214, 252505, 139706, 74632, 943492, 314130, 187037, 139706};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 28));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 87));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 94));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 123));
    }
}
