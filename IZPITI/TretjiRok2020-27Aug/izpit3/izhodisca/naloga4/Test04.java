
public class Test04 {

    public static void main(String[] args) {
        Cetrta.Generator gen = () -> -1234567890;
        System.out.println(Cetrta.stKlicev(gen, 5));
        System.out.println(Cetrta.stKlicev(gen, 11));
        System.out.println(Cetrta.stKlicev(gen, 42));
        System.out.println(Cetrta.stKlicev(gen, 1234));
    }
}
