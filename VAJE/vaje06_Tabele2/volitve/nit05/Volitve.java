import java.util.Arrays;

public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int CurrentVotes[]=t[leto][stranka];
        int total=0;
        for (int x:CurrentVotes){
            total+=x;
        }
        return total;

        
        //return -1;
    }

    public static int[][] glasovi(int[][][] t) {

        int[][] LxS = new int[t.length][t[0].length];
        int steviloLet=t.length;
        for (int leto=0;leto<steviloLet;leto++){
            for (int j=0;j<t[leto].length;j++){ // j=stranka;
                int currentNumber[]=t[leto][j];
                int total=0;
                for (int x:currentNumber){
                    total+=x;
                }
                LxS[leto][j]=total;
            }
        }


        return LxS;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int stVolisc=t[0][0].length;
        int steviloLet=t.length;
        int maximumVolisceIndex=0;
        int maximumVolisceNumber=0;
        for (int i=0;i<stVolisc;i++){
            int total=0;
            for (int j=0;j<steviloLet;j++){
                int currentNumber=t[j][stranka][i];
                total+=currentNumber;
            }
            if (total>maximumVolisceNumber){
                maximumVolisceIndex=i;
                maximumVolisceNumber=total;
            }
        }
        return maximumVolisceIndex;
    }
            


    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int steviloLet=t.length;
        int stVolisc=t[0][0].length;
        int stStrank=t[0].length;
        int total=0;
        for (int i=0;i<steviloLet;i++){
                int currentNumber=t[i][stranka][volisce];
                int currentIndex=1;
                for (int k=0;k<stStrank;k++){
                    int current=t[i][k][volisce];
                    if (current>currentNumber){
                        currentIndex++;
                    }
                }
                total+=currentIndex;
            }
            return total;
                
                    


            
    }
}
