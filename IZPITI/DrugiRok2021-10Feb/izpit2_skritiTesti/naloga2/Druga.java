
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] t=new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                t[i][j]=sc.nextInt();
            }
        }
        // for (int i=0;i<t.length;i++){
        //     System.out.println(Arrays.toString(t[i]));
        // }
        int current=0;
        int[]x=new int[b]; // kle bom shranjevou visine stolpcou pol pa na izi zracunamo
        for (int i=0;i<b;i++){
            current=0;
            for (int j=0;j<a;j++){
                current+=t[j][i];
            }
            x[i]=current;
        }
        //System.out.println(Arrays.toString(x));
        int previous=0;
        int vzpon=0;
        int dol=0;
        for (int i=0;i<x.length;i++){
            
            if (i==0){
                previous=x[i];
                //System.out.printf("previous set to %d%n",previous);
            }
            else{
                if (x[i]>previous){
                    vzpon+=x[i]-previous;
                }
                else if (x[i]<previous){ // ce je x[i]<previous
                    dol+=previous-x[i];
                }
                previous=x[i];
            }
        }
        System.out.println(vzpon);
        System.out.println(dol);




    }
}
