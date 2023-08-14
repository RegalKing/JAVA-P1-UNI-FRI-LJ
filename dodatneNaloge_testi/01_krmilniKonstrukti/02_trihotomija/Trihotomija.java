import java.util.*;

public class Trihotomija{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int first = sc.nextInt(); // First number
            int second = sc.nextInt(); // Second number
            if(first>second){
                System.out.println("1");
            }
            else if(second>first){
                System.out.println("-1");
            }
            else{
                System.out.println("0");
            }
    }
}
