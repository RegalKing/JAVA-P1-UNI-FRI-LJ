import java.util.*;

public class AnzetoveSvece {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int steviloVrstic=(int)(Math.pow(2, n-1));
        int steviloStolpcev=n-1;
        System.out.println(steviloVrstic);
        for (int i=0; i<=steviloVrstic;i++){
             System.out.printf("*");
        }
        System.out.println();
        for (int i=0; i<=steviloVrstic;i++){
            if(i%2==0){
                System.out.printf("*");
            }
            else{
                System.out.printf(" ");
            }
        }
        System.out.println();
    }
}

