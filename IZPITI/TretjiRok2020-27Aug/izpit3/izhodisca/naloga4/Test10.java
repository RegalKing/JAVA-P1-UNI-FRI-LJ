
public class Test10 {

    public static void main(String[] args) {
        Cetrta.Generator gen = new Cetrta.Generator() {
            int n = 31;
            
            @Override
            public int naslednji() {
                int stariN = this.n;
                this.n = this.n * this.n % 97;
                return stariN + 1000000000;
            }
        };

        System.out.println(Cetrta.stKlicev(gen, 2));
        System.out.println(Cetrta.stKlicev(gen, 5));
    }
}
