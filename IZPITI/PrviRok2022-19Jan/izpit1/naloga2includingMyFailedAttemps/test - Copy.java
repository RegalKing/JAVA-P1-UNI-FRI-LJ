import java.util.*;

public class test{
    public static void main(String[] args){
        int strelec=1;
        boolean[][]igralci={
            {false, false, false, false, false, true, false},
            {false, false, false, false, false, false, false},
            {false, false, false, false, true, false, false},
            };
            

        int smer=1;

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
        int rezultat=Integer.MAX_VALUE;
        int jeOdzgori=0;
        for (int i=0;i<igralci.length;i++){ 
            for (int j=1;j<igralci[0].length-1;j++){ // i=1 in igralci.length[0]-1 je zato ker ni treba cekirat stolpcev z goli ker tam ni igralcev
                if (igralci[i][j]==true){
                    //System.out.printf("x=%d,y=%d%n",j,i);
                    if (i<sredina){ // CE JE NAD SREDINO
                        if ((sredina-i<j-doGola && j>strelec && smer==1) || (sredina-i<strelec-j && j<strelec && smer==-1)){
                            //System.out.printf("1SREDINA-I=%d-%d=%d%n",sredina,i,sredina-i);
                            //System.out.printf("x=%d,y=%d%n",j,i);
                            int distance=0;
                            if (smer==1){distance=j-doGola;}else{distance=strelec-j;}
                            if (j<najnizjiX){
                                rezultat=distance;
                                najnizjiX=j;
                                System.out.printf("NAJNIZJI X=%d",najnizjiX);
                            }
                        }
                    }
                    else if (i>sredina){ // ce je i>sredina, CE JE POD SREDINO
                        if ((i-sredina<j-doGola && j>strelec && smer==1) || (i-sredina<strelec-j && j<strelec && smer==-1)){
                            counter++;
                            int distance=0;
                            if (smer==1){distance=j-doGola;}else{distance=strelec-j;}
                            if (j<najnizjiX){
                                rezultat=distance;
                                najnizjiX=j;
                                System.out.printf("NAJNIZJI X=%d",najnizjiX);
                            }
                            //System.out.printf("2I-SREDINA=%d-%d=%d%n",i,sredina,i-sredina);
                            //System.out.printf("x=%d,y=%d%n",j,i);
                        }
                    }
                else{ // ce je igralec NA SREDINI
                    if (smer==1){
                        rezultat=j-strelec;
                    }
                    else{ // ce je smer ==-1;
                        rezultat=strelec-j;
                    }
                }
            }
        }
    }
    if (rezultat!=Integer.MAX_VALUE){
        System.out.println(rezultat);
        System.out.println("TEST1");
    }
    else{
        System.out.println(doGola+1);
        System.out.println("TEST2");
    }
    //System.out.println(sredina);
    
}
}
