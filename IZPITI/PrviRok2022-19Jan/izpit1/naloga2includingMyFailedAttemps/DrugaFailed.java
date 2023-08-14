
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int[][] potZoge() {
    //public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int strelec=5;
        boolean[][]igralci={
            {false, false, false, false, false, false, false, true, false, false, false, false},
            {false, false, false, false, true, false, false, false, false, false, false, false},
            {false, false, false, false, false, true, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false, false, false, true, false},
            {false, false, false, false, false, false, true, false, false, false, false, false},
            {false, false, false, true, false, false, false, false, false, true, false, false},
        };
        int smer=1;
    
        int tabela[][]=new int[igralci.length][igralci[0].length];
        int mid=(igralci.length-1)/2;
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
        int doGola=0;
        int distance=0;
        if (smer==1){
            doGola=tabela.length-strelec-1;
        }
        if (smer==-1){
            doGola=tabela.length-strelec-1;
        }
            
        boolean found=false;
        for (int l=0;l<tabela.length;l++){
            for (int i=1;i<tabela.length-1;i++){ // levi in desni stolpcev kjer sta gola ni igralcev zato ni treba da pocekiramo
                for (int j=1;j<tabela[0].length-1;j++){
                    if (tabela[i][j]==1){
                        if (smer==1){
                            if ((mid-i==1 || mid-i==-1) && (mid)-j==0){ //tale strelec-j==-1 je za smer desno
                                found=true;
                            }
                        }

                            else if (smer==-1){
                                if ((mid-i==1 || mid-i==-1) && (mid)-j==0){ //tale strelec-j==-1 je za smer desno
                                    found=true;
                                }
                            }
                             
                    }
                }
            }
                if (found==true){
                    //return distance;
                    System.out.println("FOUND");
                }
                if (found==true){
                    break;
                }
                if (found==false){ //premakni igralce blizje middle liniji
                    distance++;
                    for (int i=0;i<tabela.length;i++){ // levi in desni stolpcev kjer sta gola ni igralcev zato ni treba da pocekiramo
                        for (int j=0;j<tabela[0].length-1;j++){
                            if (j==mid){
                                continue;
                            }
                            else{
                                if (j>mid && tabela[i][j]==0){ //ce se nahaja nad MID
                                    tabela[i][j]=0;
                                    tabela[i][j-1]=4;
                                }
                                else if (j<mid && tabela[i][j]==0){ // ce se nahaja pod MID
                                    tabela[i][j]=0;
                                    tabela[i][j+1]=3;
                                }
                            }
                        }
                    }
                }



            }
        //return distance;
        return tabela;
    }


    public static void main(String[] args) {
        int[][] path=potZoge();
        System.out.println(Arrays.toString(path[0]));
        System.out.println(Arrays.toString(path[1]));
        System.out.println(Arrays.toString(path[2]));
        System.out.println(Arrays.toString(path[3]));
        System.out.println(Arrays.toString(path[4]));
        System.out.println(Arrays.toString(path[5]));
        System.out.println(Arrays.toString(path[6]));
    }
}
