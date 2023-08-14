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
        boolean highestOFabcREACHED=false;
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
            System.out.printf(" ");

            if (counterB > 0) {
                for (int j = 1; j <= b; j++) {
                    System.out.printf("%d", b);
                }
                counterB--;
            }

            else if (highestOFabcREACHED==false) {
                steviloPresledkov = b;
                for (int k = 0; k < b; k++) {
                    System.out.printf(" ");
                }
            }
            System.out.printf(" ");


            if (counterC > 0) {
                for (int j = 1; j <= c; j++) {
                    System.out.printf("%d", c);
                }
                System.out.printf(" ");
                counterC--;
            }

            System.out.println();

        }

    }

}
