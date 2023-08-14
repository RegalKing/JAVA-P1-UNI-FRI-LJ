
import java.util.Random;

public class Test08 {

    public static void main(String[] args) {
        Random random = new Random(88888888);
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(100), 1));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(100), 3));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(100), 10));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(100), 42));
    }
}
