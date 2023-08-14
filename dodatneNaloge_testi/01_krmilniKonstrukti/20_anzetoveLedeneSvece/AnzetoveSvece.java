import java.util.*;

public class AnzetoveSvece {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dolzinaVrstic=(int)(Math.pow(2, n-1));
        // formula za stevilo presledkov med zvezdami v vrstici: 2^n-1, to pogruntas da prestejes presledke in ih izpises in vidis zaporedje 0,1,3,15,31
        int SpaceCounter=0;
        int temp=0;
        for(int i=0; i<n; i++){
            System.out.printf("*");
            while (dolzinaVrstic>0){
                for (int k=0; k<SpaceCounter; k++){
                    System.out.printf(" ");
                    dolzinaVrstic--;
                }
                System.out.printf("*");
                dolzinaVrstic--;
            }
            System.out.println();
            temp++;
            SpaceCounter=(int)(Math.pow(2, temp)-1);
            dolzinaVrstic=(int)(Math.pow(2, n-1));
        }
    }
}