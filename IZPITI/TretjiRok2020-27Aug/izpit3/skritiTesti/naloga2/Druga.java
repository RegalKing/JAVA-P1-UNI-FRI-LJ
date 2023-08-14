
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int stPresezkov(int[][] r, int meja) {
        int total=0;
        for (int i=0;i<r.length;i++){
            for (int j=0;j<r[i].length;j++){
                if(r[i][j]>meja){
                    total++;
                }
            }
        }
        return total;


    }

    public static int nedeljskoPovprecje(int[][] r) {
        int total=0;
        int stevec=0;
        int count=0;
        for (int i=0;i<r.length;i++){
            for (int j=0;j<r[i].length;j++){
                if (count==6){
                    stevec++;
                    total+=r[i][j];
                    count=0;
                }
                else{
                    count++;
                }
            }
        }
        return (total/stevec);

    }
}
