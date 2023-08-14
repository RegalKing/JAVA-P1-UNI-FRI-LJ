
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for (int i=a;i<=b;i++){
            int AliChenovo=JeChenovo(i);
            sum+=AliChenovo;
        }
        System.out.println(sum);

    }
    public static int JeChenovo(int n){
        int number=n+2;
        int numberOfDivisors=0;
        int je=0;
        for (int i=1;i<=number;i++){
            if (number%i==0){
                numberOfDivisors++;
            }
            if (numberOfDivisors>4){
                break;
            }
        }
        if (numberOfDivisors<=4 && jePrastevilo(n)){
            je=1;
        }
        return je;
    }
    public static boolean jePrastevilo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
 }

}
