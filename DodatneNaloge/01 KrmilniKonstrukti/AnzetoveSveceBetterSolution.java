import java.util.*;

class AnzetoveSveceBetterSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int t = (int)Math.pow(2, a - 1);

        for(int i = 0; i < a; i++) {
            int n = (int)Math.pow(2, a - i - 1);
            int s = t/n - 1;
            for(int j = 0; j < n; j++) {
                System.out.print("*");
                for(int k = 0; k < s; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}