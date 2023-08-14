import java.util.*;



public class PiramidaStevil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c;
        int d;
        int steviloStevilk;
        for (int i=1;i<=n;i++){ // sprinta presledke
            int steviloPresledkov=n-i;
            int znizajPresledke=steviloPresledkov;
            while (znizajPresledke>0){ 
                System.out.printf(" ");
                znizajPresledke--;
            }
            steviloStevilk=2*i-1;
            c=i;
            while (steviloStevilk>0){
                d=c%10;
                System.out.printf("%d",d);
                c++;
                steviloStevilk--;
            }
            System.out.println();




        }
    }
}



                    
                


            
