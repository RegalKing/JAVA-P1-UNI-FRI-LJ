
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int stGlav=sc.nextInt();
        int stKupcev=sc.nextInt();
        int naVoljo=stGlav;
        int stBanjevk=0;
        for (int i=1;i<=stKupcev;i++){
            // System.out.println("NA VOLJO START="+naVoljo);
            int trenutnaZahteva=sc.nextInt();
            if (naVoljo>=trenutnaZahteva){
                naVoljo-=trenutnaZahteva;
                // System.out.println("ZAHTEVA="+trenutnaZahteva);
                // System.out.println("NA VOLJO AFTER ZAHTEVA="+naVoljo);
            }
            else{
                naVoljo=stGlav;
                naVoljo-=trenutnaZahteva;
                stBanjevk++;
            }
        }
        System.out.println(stBanjevk+1);



    }
}
