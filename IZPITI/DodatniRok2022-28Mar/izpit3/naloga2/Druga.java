
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int t[][]=new int [h][w];
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                t[i][j]=sc.nextInt();
            }
        }
        // for (int i=0;i<h;i++){
        //     System.out.println(Arrays.toString(t[i]));
        //     }
        int counter=0;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (t[i][j]==1){
                    //System.out.println("["+i+","+j+"]");
                    if (j==0){ //prvi stolpec
                        counter++;
                    }
                    if (j==w-1 && j!=0){ //zadnji stolpec
                        counter++; 
                    }
                    else if (j!=0 && j!=w-1 && i==0){ // med prvim in zadnjim stolpcev PRVA VRSTICA
                        counter++;
                    }
                    else if (j!=0 && j!=w-1 && i==h-1){ // med prvim in zadnjim stolpcev ZADNJA VRSTICA
                        counter++;
                    }
                    else if(j!=0 && j!=w-1 && i!=0 && i!=h-1){ // preverm da ni na robu 
                    if (t[i+1][j]==0 || t[i-1][j]==0 || t[i][j-1]==0 || t[i][j+1]==0 || t[i+1][j+1]==0 || t[i-1][j-1]==0 || t[i-1][j+1]==0 || t[i+1][j-1]==0){
                        counter++;
                    }
                }
                }
            }
        }
        System.out.println(counter);



    }
}
