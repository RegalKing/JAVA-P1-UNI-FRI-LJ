import java.util.*;
public class Druga { 

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int sredina=(igralci.length/2);
        int razdalja=0;
        int doGola= smer==1 ? igralci[0].length-strelec-1: strelec; // razdalja od zoge do gola na zeleni strani glede na smer
        boolean found=false;
        for (int j=1;j<igralci[0].length-1;j++){  
            for (int i=1;i<=igralci.length-1;i++){ // i=1 in igralci.length-1 je zato ker ni treba cekirat stolpcev z goli ker tam ni igralcev, isto velja za x axis v zgornjem for statementu
                if (igralci[i][j]==true){
                    int distance=i-sredina;
                    if (distance<0){distance*=-1;}
                    if ((distance<=j-strelec && smer==1) || (distance<=strelec-j && smer ==-1)){
                        if (smer==1){
                            razdalja=j-strelec;
                            found=true;
                            return razdalja;
                        }
                        else{ // smer==-1
                         razdalja=strelec-j;
                         found=true;
                        }
                    }
                }
            }
        }
        return found==false?doGola:razdalja;
    }
}