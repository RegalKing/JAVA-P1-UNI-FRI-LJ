import java.util.*;

            public class PotencaPoModuluPreOptimization4Narobe {
                public static void main (String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int m = sc.nextInt();
                    int potenca=potenca(a,b);
                    int ostanek=ostanek(potenca,m);
                    System.out.println(ostanek);
                }

                public static int potenca(int a, int b){
                    int potenca=(int)Math.pow(a, b);
                    return potenca;
                }

                public static int ostanek(int potenca, int m){
                    int ostanek=potenca%m;
                    return ostanek;
                }
            }
        
