import java.util.*;

public class Smucanje {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int steviloSmucarja=0;
        int prviCas=0;
        int drugiCas=0;
        for (int i=1;i<=n;i++){

            prviCas = sc.nextInt();
            if (prviCas==0) continue;

            drugiCas = sc.nextInt();
            if (drugiCas==0) continue;

            if (prviCas+drugiCas<min){
                min=prviCas+drugiCas;
                steviloSmucarja=i;
            }

            }
            if (min==Integer.MAX_VALUE){
                System.out.println("NIHCE");
            }
            else{
            System.out.println(steviloSmucarja);
            System.out.println(min);
            }
            
        }



}
