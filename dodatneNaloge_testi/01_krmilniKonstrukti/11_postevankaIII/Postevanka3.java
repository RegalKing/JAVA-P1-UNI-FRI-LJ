import java.util.*;

public class Postevanka3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int counter=0;
        int cap=b;
        while (a*counter<cap && (cap-a*counter)>=a){
            counter++;
            System.out.println(a+" * "+counter+" = "+a*counter);
            
        }
    }
}

