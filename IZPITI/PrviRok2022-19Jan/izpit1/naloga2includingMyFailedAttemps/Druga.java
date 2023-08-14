/*
 * tj.exe
 */

import java.util.*;

public class Druga { 

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int sredina=(igralci.length/2);
        int doGola=0;
        int razdalja=0;
        if (smer==1){
            doGola=igralci[0].length-strelec-2;
        }
        else{ //ce je smer==-1
            doGola=strelec-1;
        }
        //return(doGola);
        boolean found=false;
        //return(doGola);
        //outerloop:
        for (int j=1;j<igralci[0].length-1;j++){ 
            for (int i=0;i<igralci.length;i++){ // i=1 in igralci.length[0]-1 je zato ker ni treba cekirat stolpcev z goli ker tam ni igralcev
                if (igralci[i][j]==true){
                    //System.out.printf("x=%d,y=%d%n",j,i);
                    int distance=i-sredina;
                    if (distance<0){distance*=-1;}
                    //return(distance);
                    if ((distance<=j-strelec && smer==1) || (distance<=strelec-j && smer ==-1)){
                        //System.out.printf("x=%d,y=%d%n",j,i);
                        if (smer==1){
                            razdalja=j-strelec;
                            found=true;
                            return razdalja;
                            
                            
                        }
                        else if (smer==-1){ // smer==-1
                         razdalja=strelec-j;
                         found=true;
                         
                         
                         
                        }
                    }
                }
            }
        }
        
        if (found==false){
            return(doGola+1);
        }
        return razdalja;
    }
    
    

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}