
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
        int[][]t=new int[m][m];         // nardim novo tabelo k je by default nafilana z niclami zato je n=0 edge case scenarij ze covered
        for (int i=0;i<p.length;i++){
            int distance=p[i][2];
            int startingx=p[i][0];
            int y=p[i][1];      // nafilam tabelo z 1 kjer je polica
            if (distance==1){           // ce je distance 1 edge case scenario pokrijem
                t[y][startingx]=1;
            }
            else{
            for (int j=0;j<distance;j++){ // postavim police v array t kot vrednosti 1 kjer je polica
            t[y][startingx+j]=1;
            }
        }
    }
    int highest=Integer.MIN_VALUE;
    //boolean samenule=true;
    for (int i=0;i<t[0].length;i++){    //gre cez use stolpce, i representa X koordinato 
        //samenule=true;
        int current=0;                  // current bo predstavlu najdalsi stolpc nicel
        for (int j=0;j<t.length;j++){   // za vsak stolpc gre cez use Y koordinate, J representa Y koordinato
            if (t[j][i]==1){
                //samenule=false;
                if (current>highest){  // ce je trenutn stolpc daljsi predn hitta enko
                    highest=current;
                }
                break;                 // ce hitta 1 konca loopanje Y-ov v tem X-stolpcu in gre na naslednji X stolpec
            }
            else if (t[j][i]==0){
                current++;
            }
        }
        if (current==m){                // ce so same nicle v stolpcu nastavi highest na visino stolpca (m)
            highest=m;
        }
    }
    return highest;
}
}

