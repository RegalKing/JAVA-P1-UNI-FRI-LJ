
public class Test09 {

    public static void main(String[] args) {
        Cetrta.Generator gen = new Cetrta.Generator() {
            int n = 1;
            
            @Override
            public int naslednji() {
                int stariN = this.n;
                this.n = 13 * this.n % 31;
                return -1000000000 - stariN;
            }
        };

        System.out.println(Cetrta.stKlicev(gen, 3));
        System.out.println(Cetrta.stKlicev(gen, 6));
    }
}
