import java.util.*;

public class Timenik2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] imenik = new String[2][n];
        for (int i = 0; i < n; i++) {
            // System.out.println(i);
            String a = sc.next();
            boolean ZeObstaja = false;
            for (int h = 0; h < i; h++) {
                String b = imenik[0][h];
                if (a.equals(b)) {
                    imenik[1][h] = sc.next();
                    ZeObstaja = true;
                    // System.out.println("ZE OBSTAJA="+ZeObstaja);
                    // System.out.println(Arrays.deepToString(imenik));
                }
            }
            if (ZeObstaja == false) {
                imenik[0][i] = a;
                imenik[1][i] = sc.next();
                // System.out.println("ZE OBSTAJA="+ZeObstaja);
                // System.out.println(Arrays.deepToString(imenik));
            }

        }
        // System.out.println(Arrays.deepToString(imenik));

        int k = sc.nextInt();
        for (int b = 0; b < k; b++) {
            String ime = sc.next();
            int index = Arrays.asList(imenik[0]).indexOf(ime);
            if (index != -1) {
                System.out.println(imenik[1][index]);
            } else {
                System.out.println("NEZNANA");
            }
        }

    }
}
