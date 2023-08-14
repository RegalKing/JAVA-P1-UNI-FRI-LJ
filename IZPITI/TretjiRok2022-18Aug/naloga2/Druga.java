
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02, 03: manj"sa la"zja primera (vsaka navpi"cna premica seka natanko eno polico)
 * 04..06: ve"cji la"zji primeri
 * 07: manj"si splo"sni primer
 * 08..10: ve"cji splo"sni primeri
 *
 * Skriti testni primeri:
 * 01..25: la"zji
 * 26..50: splo"sni
 *
 * Za vsako polico velja x >= 0, d >= 1, x + d <= m, y >= 1 in y <= m
 * (d je dol"zina police).  Police se med seboj ne prekrivajo.
 */

import java.util.*;

public class Druga {

    public static int najGlobina(int m, int[][] p) {
        int[][]t=new int[m][m];
        for (int i=0;i<p.length;i++){
            int distance=p[i][2];
            int startingx=p[i][0];
            int y=p[i][1];
            if (distance==1){
                t[y][startingx]=1;
            }
            else{
            for (int j=0;j<distance;j++){
            t[y][startingx+j]=1;
            }
        }
    }
    int highest=Integer.MIN_VALUE;
    //boolean samenule=true;
    for (int i=0;i<t[0].length;i++){
        //samenule=true;
        int current=0;
        for (int j=0;j<t.length;j++){
            if (t[j][i]==1){
                //samenule=false;
                if (current>highest){
                    highest=current;
                }
                break;
            }
            else if (t[j][i]==0){
                current++;
            }
        }
        if (current==m){
            highest=m;
        }
    }
    if (highest==Integer.MIN_VALUE){
        return m;
    }
    else{
        return highest;
    }
    
}

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
