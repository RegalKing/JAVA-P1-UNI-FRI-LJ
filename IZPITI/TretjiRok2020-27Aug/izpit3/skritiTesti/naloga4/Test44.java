
public class Test44 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {64060952, -20229261, -30244986, -9871974, -83285398, -40712774, 6802504, -95888803, -87243730, -22480731, 38964865, 24622142, -64060952, 64060952, 6802504, 22480731, -20229261, 54957226, 20229261, -12848878, 20229261, -95888803, 24622142, 13247295, 64060952, -65131988, 54957226, 6802504, -94891978, 83285398, -17392595, -83285398, 85000230, 64060952, 38964865, -83285398, -64060952, 30244986, 9900330, -22480731, -92512521, 87243730, -30244986, 40712774};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 25));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 75));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 116));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 141));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 149));
    }
}
