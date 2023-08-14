
public class Test49 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {8974646, 864951, 8382756, 4654299, 7730450, 4745266, 8068863, 4745266, 8016446, 7730450, 8974646, 9629939, 151360, 8016446, 7730450, 3626623, 4692849, 9546771, 8893457, 8016446, 3857729, 3217555, 2354476, 8382756, 2330161, 6865458, 3857729, 9629939, 2103477, 8974646, 864951, 4745266, 8382756, 9546771, 8893457, 864951, 151360, 6865458, 2354476, 4654299, 6865458, 8016446, 9629939, 4745266, 3626623, 4745266, 3857729, 2103477, 9629939};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 4));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 131));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 134));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 137));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 167));
    }
}
