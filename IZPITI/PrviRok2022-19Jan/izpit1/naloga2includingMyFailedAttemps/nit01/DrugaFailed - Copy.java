
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int tabela[][]=new int[igralci.length][igralci[0].length];
        int visina=igralci.length;
        int mid=visina/2+1;
        for (int i=0;i<igralci.length;i++){
            for (int j=0;j<igralci[0].length;j++){
                if (igralci[i][j]==true){
                    tabela[i][j]=1; //tam kjer so igralci bo 1;
                }
                else{
                    tabela[i][j]=0;//tam kjer ni igralcev bo 0;
                }
            }
        }

        
        tabela[mid][strelec]=2;//tam kjer je zoga bo 2;
        int distance=0;
        boolean found=false;
        for (int l=0;l<10;l++){
            for (int i=1;i<tabela.length-1;i++){ // levi in desni stolpcev kjer sta gola ni igralcev zato ni treba da pocekiramo
                for (int j=1;j<tabela[0].length-1;j++){
                    if (tabela[i][j]==1){
                        if (smer==1){
                            if ((mid-i==1 || mid-i==-1) && (strelec+distance)-j==-1){ //tale strelec-j==-1 je za smer desno
                                found=true;
                            }
                        }

                            else if (smer==-1){
                                if ((mid-i==1 || mid-i==-1) && (strelec+distance)-j==1){ //tale strelec-j==-1 je za smer desno
                                    found=true;
                                }
                            }
                             
                    }
                }
            }
                if (found==true){
                    return distance;
                }
                if (found==true){
                    break;
                }
                if (found==false){ //premakni igralce blizje middle liniji
                    distance++;
                    for (int i=1;i<tabela.length-1;i++){ // levi in desni stolpcev kjer sta gola ni igralcev zato ni treba da pocekiramo
                        for (int j=1;j<tabela[0].length-1;j++){
                            if (j==mid){
                                continue;
                            }
                            else{
                                if (j>mid){ //ce se nahaja nad MID
                                    tabela[i][j]=0;
                                    tabela[i][j-1]=1;
                                }
                                else{ // ce se nahaja pod MID
                                    tabela[i][j]=0;
                                    tabela[i][j+1]=1;
                                }
                            }
                        }
                    }
                }



            }
        return tabela;
    }


    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
