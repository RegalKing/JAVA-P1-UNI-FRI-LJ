
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for (int i=0;i<a;i++){
            int x=sc.nextInt();
            int[]t=separateIntoDigits(x);
            boolean padajoce=true;
            int previous=0;
            for (int j=0;j<t.length;j++){
                if (j==0){
                    previous=t[j];
                }
                else{
                    if (t[j]>previous){
                        padajoce=false;
                    }
                    else{
                        previous=t[j];
                    }
                }
            }
            if (padajoce==true){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
                    

        }
    }
    public static int[] separateIntoDigits (int num){ // this method separates an integer into an array of its digits
        String number = String.valueOf(num);
            int[] digits=new int[number.length()];
            for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            digits[i]=j;
            }
            // System.out.println(Arrays.toString(digits)); 
            return digits;
        }
}
