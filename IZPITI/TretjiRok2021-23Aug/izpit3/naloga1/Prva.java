
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        int v=sc.nextInt();
        int sum=0;
        int lowest=Integer.MAX_VALUE;
        int lowestnumber=Integer.MAX_VALUE;
        for (int i=(int)Math.pow(10, d-1);i<((int)Math.pow(10, d));i++){
            int t[]=separateIntoDigits(i);
            sum=0;
                for (int k=0;k<d;k++){
                    sum+=t[k];
                }
                //System.out.printf("ZA i=%d,je sum %d%n",i,sum);
                if (sum==v){
                    System.out.println(i);
                    break;
                }

        }
        //System.out.println(lowestnumber);
        // System.out.println(Arrays.toString(t));
        
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
