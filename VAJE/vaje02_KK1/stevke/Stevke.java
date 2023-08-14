import java.util.Scanner;

public class Stevke {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();

        while (n>0){
            System.out.println(n%10);
            n=n/10;
        }
        
    }
}
