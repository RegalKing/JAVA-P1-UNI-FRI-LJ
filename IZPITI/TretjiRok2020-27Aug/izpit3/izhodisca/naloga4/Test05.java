
public class Test05 {

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
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 5));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 11));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 42));
        System.out.println(Cetrta.stKlicev(new MojGenerator(), 1234));
    }
}
