import java.util.*;

public class test{
    public static void main(String[] args){
        int strelec=5;
        boolean[][]igralci={
            {false, false, false, false, false, false, false, true, false, false, false, false},
            {false, false, false, false, true, false, false, false, false, false, false, false},
            {false, false, false, false, false, true, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false, false, false, false, false},
            {false, true, true, false, false, false, false, false, false, false, true, false},
            {false, false, false, false, false, false, true, false, false, false, false, false},
            {false, false, false, true, false, false, false, false, false, true, false, false},
        };
            

        int smer=-1;

        int sredina=(igralci.length/2);
        int doGola=0;
        int distance=0;
        if (smer==1){
            doGola=igralci[0].length-strelec-2;
        }
        else{ //ce je smer==-1
            doGola=strelec-1;
        }
        //System.out.println(doGola);
        boolean found=false;
        //System.out.println(doGola);
        outerloop:
        for (int j=1;j<igralci[0].length-1;j++){ 
            for (int i=0;i<igralci.length;i++){ // i=1 in igralci.length[0]-1 je zato ker ni treba cekirat stolpcev z goli ker tam ni igralcev
                if (igralci[i][j]==true){
                    //System.out.printf("x=%d,y=%d%n",j,i);
                    distance=i-sredina;
                    if (distance<0){distance*=-1;}
                    //System.out.println(distance);
                    if ((distance<=j-strelec && smer==1) || (distance<=strelec-j && smer ==-1)){
                        System.out.printf("x=%d,y=%d%n",j,i);
                        int razdalja=0;
                        if (smer==1){
                            razdalja=(j-strelec)*smer;
                            System.out.println(razdalja);
                            found=true;
                            break outerloop;
                        }
                        else if (smer==-1){ // smer==-1
                         razdalja=strelec-j;
                         System.out.println(razdalja);
                         found=true;
                         
                        }
                    }
                }
            }
        }
        if (found==false){
            System.out.println(doGola+1);
        }
                    
    
}
}
