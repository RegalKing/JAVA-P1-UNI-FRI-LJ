
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
            int stdeljiteljev=StDeljiteljev(i+2);
            if (stdeljiteljev<=4){
                sum++;
            }
        }
        System.out.println(sum);

    }
    public static int StDeljiteljev(int n){
        int stdeljiteljev=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                stdeljiteljev++;
            }
        }
        return stdeljiteljev;
    }



}
