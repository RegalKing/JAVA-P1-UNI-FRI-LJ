import java.util.*;

public class IgorjeviBloki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int counterA = a;
        int counterB = b;
        int counterC = c;
        int steviloPresledkov;
        int buffer = Math.max(a, b);
        int steviloVrstic = Math.max(buffer, c);

        for (int i = 1; i <= steviloVrstic; i++) {
            if (counterA > 0) {
                for (int j = 1; j <= a; j++) {
                    System.out.printf("%d", a);
                }
                counterA--;
            } else {
                steviloPresledkov = a;
                for (int k = 0; k < a; k++) {
                    System.out.printf(" ");
                }
            }
            if (counterB > 0 || counterC > 0) { // skor 45min sm rabu za te 3 linije da odstranm odvecne presledke FML
                System.out.printf(" ");
            }

            if (counterB > 0) {
                for (int j = 1; j <= b; j++) {
                    System.out.printf("%d", b);
                }
                counterB--;
            }

            else if (counterC > 0) { // skor 45min sm rabu za te 3 linije da odstranm odvecne presledke FML
                steviloPresledkov = b;
                for (int k = 0; k < b; k++) {
                    System.out.printf(" ");
                }
            }
            if (counterC > 0) { // skor 45min sm rabu za te 3 linije da odstranm odvecne presledke FML
                System.out.printf(" ");
            }

            if (counterC > 0) {
                for (int j = 1; j <= c; j++) {
                    System.out.printf("%d", c);
                }
                counterC--;
            }

            System.out.println();

        }

    }

}
