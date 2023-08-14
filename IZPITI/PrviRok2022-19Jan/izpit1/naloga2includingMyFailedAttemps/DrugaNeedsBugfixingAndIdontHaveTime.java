
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int sredina=(igralci.length/2);
        int doGola=0;
        if (smer==1){
            doGola=igralci[0].length-strelec-2;
        }
        else{ //ce je smer==-1
            doGola=strelec-1;
        }
        //System.out.println(doGola);
        int counter=0;
        int najnizjiX=Integer.MAX_VALUE;
        int Y=Integer.MAX_VALUE;
        int jeOdzgori=0;
        for (int i=0;i<igralci.length;i++){ 
            for (int j=1;j<igralci[0].length-1;j++){ // i=1 in igralci.length[0]-1 je zato ker ni treba cekirat stolpcev z goli ker tam ni igralcev
                if (igralci[i][j]==true){
                    //System.out.printf("x=%d,y=%d%n",j,i);
                    if (i<sredina){ // CE JE NAD SREDINO
                        if ((sredina-i<j-doGola && j>strelec && smer==1) || (sredina-i<strelec-j && j<strelec && smer==-1)){
                            //System.out.printf("1SREDINA-I=%d-%d=%d%n",sredina,i,sredina-i);
                            //System.out.printf("x=%d,y=%d%n",j,i);
                            if (j<najnizjiX){
                                najnizjiX=j;
                                Y=i;
                                jeOdzgori=1;
                            }
                        }
                    }
                    else if (i>sredina){ // ce je i>sredina, CE JE POD SREDINO
                        if ((i-sredina<j-doGola && j>strelec && smer==1) || (i-sredina<strelec-j && j<strelec && smer==-1)){
                            counter++;
                            if (j<najnizjiX){
                                najnizjiX=j;
                                Y=i;
                                jeOdzgori=2;

                            }
                            //System.out.printf("2I-SREDINA=%d-%d=%d%n",i,sredina,i-sredina);
                            //System.out.printf("x=%d,y=%d%n",j,i);
                        }
                    }
                }
            }
        }
        if (jeOdzgori==1){
            return(sredina-Y+1);
        }
        else if (jeOdzgori==2){
            return(Y-sredina+1);
        }
        else{
            return(doGola+1);
        }
    }
    

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}x
