import java.util.*;

public class UrejanjeTrojice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        if (a<=b && a<=c && b<=c && b>=a){
            System.out.println(a+" "+b+" "+c); // 123
        }
        else if (a<=b && a<=c && b>=c && b>=a){ // 132
            System.out.println(a+" "+c+" "+b);
        }
        else if (a>=b && a>=c && b<=a && b>=c){ // 321
            System.out.println(c+" "+b+" "+a);
        }
        else if (c<=a && c<=b && a>=c && a<=b){ // 312
            System.out.println(c+" "+a+" "+b);
        }
        else if (c>=a && c>=b && b<=c && b<=a){ // 213
            System.out.println(b+" "+a+" "+c);
        }
        else{
            System.out.println(b+" "+c+" "+a); // 231
        }



}
}
