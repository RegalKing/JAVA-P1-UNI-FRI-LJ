
/*
 * Samodejno testiranje:
 * tj.exe Prva.java . .
 *
 * Javni testni primeri:
 * 01, 02: primera iz besedila
 * 03..10: splo"sni primeri
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int d=sc.nextInt();
        int counter=d;
        int presledki=h-1;
        for (int i=0;i<h;i++){
            if (i==0){
                for (int k=0;k<presledki;k++){
                    System.out.printf(" ");
                }
                for (int j=0;j<d;j++){
                    System.out.printf("*");
                }
                System.out.println();
                presledki--;
            }
            
            else if(i!=h-1){
                for (int k=0;k<presledki;k++){
                    System.out.printf(" ");
                }
                presledki--;
                
                System.out.printf("*");
                for (int j=0;j<counter;j++){
                    System.out.printf(" ");
                }
                System.out.printf("*");
                System.out.println();
                counter++;
                counter++;
            }
            else if(i==h-1){
                for (int j=0;j<counter+2;j++){
                    System.out.printf("*");
                }
            }

        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
