
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i<=1000;i++){
            if (jeObilno(i)){
                System.out.println(i);
                break;
            }
            else{
                continue;
            }
        }
    }

    public static boolean jeObilno(int x){
        int sum=0;
        for (int i=1;i<x;i++){
            if (x%i==0){
                sum+=i;
            }
        }
        if (x<sum){
            return true;
        }
        else{
            return false;
        }









    }
}
