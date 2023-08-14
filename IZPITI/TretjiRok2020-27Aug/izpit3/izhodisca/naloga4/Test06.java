
public class Test06 {

    private static class MojGenerator implements Cetrta.Generator {
        private int stevilo;

        public MojGenerator() {
            this.stevilo = 0;
        }

        @Override
        public int naslednji() {
            return this.stevilo++ % 10;
        }
    }

    public static void main(String[] args) {
        Cetrta.Generator gen = new MojGenerator();
        System.out.println(Cetrta.stKlicev(gen, 5));
        System.out.println(Cetrta.stKlicev(gen, 11));
        System.out.println(Cetrta.stKlicev(gen, 42));
        System.out.println(Cetrta.stKlicev(gen, 1234));
    }
}
