import java.util.*;

public class Sahovnica {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        // LIHA=WHITE, SODA=BLACKl
        int a = sc.nextInt(); // STOLPCI
        int b = sc.nextInt(); // VRSTICE
        int c = sc.nextInt(); // SIZE OF SQUARE OF 1 FIELD (WHITE/BLACK FIELD)
        System.out.printf("+");
        int steviloVrsticMedPlusi=b*c*2+1;
        int steviloVrsticBrezKvadratov=a*c;
        int steviloKvadratovVvrsticah=b;
        int velikostKvadrata=2*c-1;
        int SteviloKvadratovVstolpcih=a;
        boolean lihaVrstica=true;
        boolean lihiStolpec=true;
        


        for (int i=1;i<=steviloVrsticMedPlusi;i++){    // prva linija
            if(i%2!=0){
            System.out.printf(" ");
            }
            else{
                System.out.printf("-");
            }
        }
        System.out.printf("+");
        System.out.println();

    for(int m=1;m<=a*c;m++){

        System.out.printf("|");
        for(int j=1;j<=b;j++){
            if(lihaVrstica==true){
                for(int k=0;k<=velikostKvadrata;k++){
                    System.out.printf(" ");
                }
                lihaVrstica=false;
            }
            else if(lihaVrstica==false){
                for(int k=0;k<=velikostKvadrata;k++){
                    if(k%2!=0){
                        System.out.printf("*");
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                lihaVrstica=true;
            }
            
        }
    
        lihaVrstica=true;
        System.out.printf(" |");
        System.out.println();
    }






    
}
}
