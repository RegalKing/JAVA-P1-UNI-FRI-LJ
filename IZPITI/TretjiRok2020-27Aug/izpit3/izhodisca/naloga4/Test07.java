
import java.util.Random;

public class Test07 {

    public static void main(String[] args) {
        Random random = new Random(7777777);
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(10), 1));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(10), 3));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(10), 10));
        System.out.println(Cetrta.stKlicev(() -> random.nextInt(10), 42));
    }
}
