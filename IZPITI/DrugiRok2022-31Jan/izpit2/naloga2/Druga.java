
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        int height=slika.length;
        int width=slika[0].length;
        int elementi=3;
        int maxGreensIndex=Integer.MIN_VALUE;
        int maxGreens=Integer.MIN_VALUE;
        for (int i=0;i<width;i++){
            int currentGreens=0;
            for (int j=0;j<height;j++){
                int red=slika[j][i][0];
                int green=slika[j][i][1];
                int blue=slika[j][i][2];
                if (green>blue && green>red){
                    currentGreens++;
                }
            }
            if (currentGreens>maxGreens){
                maxGreens=currentGreens;
                maxGreensIndex=i;
            }
        }
        return maxGreensIndex;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
