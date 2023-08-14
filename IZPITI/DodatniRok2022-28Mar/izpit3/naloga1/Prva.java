
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=0;
        int stevec=0;
        int first=sc.nextInt();
        int second=sc.nextInt();
        n--;
        while (n>0){
            int third=sc.nextInt();
            int fourth=sc.nextInt();
            n--;
            if (first==third && second==fourth){
            counter++;
            if (n>0){
                first=sc.nextInt();
                second=sc.nextInt();
                n--;
            }
        }
    }


        System.out.println(counter);
    }
}
















