
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        presledek(a,b);
        middle (a,b);
        presledek(a,b);
    }
        



        public static void presledek(int a,int b){
            for (int j=1;j<=2*a;j++){
                for (int i=0;i<b;i++){
                    System.out.printf("*");
                }
                for (int i=0;i<2*b;i++){
                    System.out.printf(" ");
                }
                for (int i=0;i<b;i++){
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
        public static void middle(int a,int b){
            for (int i=1;i<=a;i++){
                for (int j=1;j<=4*b;j++){
                    System.out.printf("*");
                }
                System.out.println();
            }
        }





    }

