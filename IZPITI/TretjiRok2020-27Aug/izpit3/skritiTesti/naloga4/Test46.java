
public class Test46 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {31691805, 28083256, 91692590, 42583725, 91692590, 8438341, 25009210, 27257364, 14996165, 12869776, 91692590, 94030275, 46133500, 14996165, 12869776, 27257364, 94030275, 22119294, 31691805, 12555368, 22119294, 94030275, 74863730, 28083256, 91692590, 8438341, 42037588, 11142356, 28083256, 82460166, 74863730, 11142356, 62464793, 74863730, 12869776, 8438341, 11142356, 12869776, 7806942, 12555368, 13119015, 22119294, 13119015, 12555368, 25009210, 11142356};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 44));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 54));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 159));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 163));
    }
}
