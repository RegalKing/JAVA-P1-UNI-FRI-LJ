import java.util.*;
        public class VBoris{
            private static Random RNG;
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int s = sc.nextInt();
                int n = sc.nextInt();
                RNG = new Random();
                RNG.setSeed(s);
                for (int dan=1;dan<=n;dan++){
                    vrziKocko(dan);




                }
            }
            public static void vrziKocko(int dan){
                int lihoCounter=0;
                int counter=0;
                boolean nedelja=false;
                if (dan%7==0){
                    System.out.printf("%4d"+" ("+"N"+"): ",dan,"weekOrEnd");
                    nedelja=true;
                }
                else{
                    System.out.printf("%4d"+" ("+"D"+"): ",dan,"weekOrEnd");
                }
                while (lihoCounter<3 && nedelja==false){
                    int trenutnoStevilo=RNG.nextInt(6)+1;
                    System.out.printf("%d ",trenutnoStevilo);
                    counter+=1;
                    if ((trenutnoStevilo%2)!=0){
                        lihoCounter+=1;
                    }
                }
                while (lihoCounter<5 && nedelja==true){
                    int trenutnoStevilo=RNG.nextInt(6)+1;
                    System.out.printf("%d ",trenutnoStevilo);
                    counter+=1;
                    if ((trenutnoStevilo%2)!=0){
                        lihoCounter+=1;
                    }
                }

                System.out.println("["+counter+"]");
    }
}

                
                