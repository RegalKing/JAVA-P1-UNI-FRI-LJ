import java.util.*;
        public class ZMojca {
            private static Random RNG;
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int s = sc.nextInt();
                int n = sc.nextInt();
                int dan = sc.nextInt();
                RNG = new Random();
                RNG.setSeed(s);
                for (int dnevi=1;dnevi<=dan;dnevi++){
                    vrziKocko(dnevi, n);




                }
            }
            public static void vrziKocko(int dan, int n){
                System.out.println(dan+". dan:");
                boolean vsotaJePrastevilo=false;
                int totalVsota;
                int counter;
                counter=0;
                totalVsota=0;
                    while (vsotaJePrastevilo==false){
                        counter++;
                        totalVsota=0;
                        System.out.printf("    "+counter+". met: ");
                        for (int k=1;k<=n;k++){
                            int trenutnoStevilo=RNG.nextInt(6)+1;
                            System.out.printf("%d ",trenutnoStevilo);
                            totalVsota+=trenutnoStevilo;
                        }
                        
                        System.out.printf("| vsota = "+totalVsota);
                        System.out.println();
                        //System.out.println("TOTALNA VSOTA="+totalVsota);
                        vsotaJePrastevilo=jePrastevilo(totalVsota);
                        //System.out.println("VSOTA="+totalVsota);
                        //System.out.println("VSOTAJEPRAST="+vsotaJePrastevilo);
                        if (vsotaJePrastevilo==true){
                            //System.out.println("TOTALNA VSOTA="+totalVsota);
                        }
                    }



            }
            public static boolean jePrastevilo(int num) {
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
         }
            
                
                
    

}

                
                