import java.util.*;

public class AbsolutnaVrednost{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Integer number (-2,147,483,648 to 2,147,483,647) input
        if(number<0){
            number=number*(-1);
            System.out.println(number);}
        else{
            System.out.println(number);}
    }
}
        
// Easier Alternative: Use Math.Abs in the print statement to get the absolute value -> System.out.println(Math.abs(number));
