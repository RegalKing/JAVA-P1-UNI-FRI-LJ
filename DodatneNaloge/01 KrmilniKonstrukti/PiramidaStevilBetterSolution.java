import java.util.*;

public class PiramidaStevilBetterSolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c;
        for (int i=1; i <= n; i++){ // i=steviloVrstic
            for(int j=0; j < (n-i); j++){
                System.out.print(" ");
            }
            c=i;
            for (int j = 0; j < 2*i-1; j++){
                System.out.print(c%10);
                c++;
            }
            System.out.println();
        }
    }
}



                    
                


            
