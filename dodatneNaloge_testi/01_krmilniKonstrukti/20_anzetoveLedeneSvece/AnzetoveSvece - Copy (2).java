import java.util.*;

public class AnzetoveSvece {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dolzinaVrstic=(int)(Math.pow(2, n-1));
        // formula za stevilo presledkov med zvezdami v vrstici: 2^n-1, to pogruntas da prestejes presledke in ih izpises in vidis zaporedje 0,1,3,15,31
        int steviloStolpcev=n;
        int Spaces=0;
        int SpaceCounter=0;
        int temp=n;
        boolean Lih=true;
        for (int i=0; i<n; i++){

                for (int j=0; j<=dolzinaVrstic; j++){
                    if (Lih==true){
                        if (j%2==0){
                            System.out.printf("*");
                        }
                        else{
                            System.out.printf(" ");
                        }
                    }    
            }
            System.out.println();
        }
    }
    }
        


