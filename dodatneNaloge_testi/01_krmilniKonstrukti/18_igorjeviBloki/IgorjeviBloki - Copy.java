import java.util.*;

public class IgorjeviBloki {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int counterA=a;
        int counterB=b;
        int counterC=c;
        int steviloPresledkov;
        int buffer=Math.max(a, b);
        int steviloVrstic=Math.max(buffer, c);

        for(int i=1;i<=steviloVrstic;i++){
            if (counterA>0){
                for(int j=1;j<=a;j++){
                    System.out.printf("%d",a);
                }

                System.out.printf(" ");
                counterA--;
            }
            else{
                steviloPresledkov=a;
                for (int k=1;k<steviloVrstic-a;k++){
                    System.out.printf(" ");
                }
                System.out.printf(" ");
            }



            if (counterB>0){
                for(int j=1;j<=b;j++){
                    System.out.printf("%d",b);
                }        
                System.out.printf(" ");
                counterB--;
            }
            
            else{
                    steviloPresledkov=b;
                    for (int k=1;k<steviloVrstic-b;k++){
                        System.out.printf(" ");
                    }
                    System.out.printf(" ");
                }


            if (counterC>0){
                for(int j=1;j<=c;j++){
                    System.out.printf("%d",c);
                }
                System.out.printf(" ");
                counterC--;
            }
            else{
                steviloPresledkov=c;
                for (int k=1;k<steviloVrstic-c;k++){
                    System.out.printf(" ");
                }
                System.out.printf(" ");
            }


                System.out.println();

        }
        
    
}
    
        }


