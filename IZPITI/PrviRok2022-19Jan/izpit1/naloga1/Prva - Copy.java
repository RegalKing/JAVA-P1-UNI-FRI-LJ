
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
        }
        if (numberOfDivisors<=4){
            je=1;
        }
        return je;
    }


}
