
public class Test50 {

    public static class MojGenerator implements Cetrta.Generator {
        private int ix;
        private static final int[] T = {175815, 157088, 733868, 619976, 578383, 175815, 122801, 85201, 217257, 619976, 97685, 31831, 578383, 31831, 122801, 962572, 581323, 217257, 76332, 619976, 791551, 269357, 937272, 979486, 979486, 76332, 791551, 619976, 610399, 106176, 610399, 733868, 85201, 578383, 578383, 183109, 962572, 962572, 97685, 610399, 217257, 22528, 85201, 116496, 581323, 610399, 962572, 116496, 721188, 962572};

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 173));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 183));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 184));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 197));
    }
}
