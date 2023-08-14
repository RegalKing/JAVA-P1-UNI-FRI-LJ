
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Opravilo {
        private String naziv;
        private int zahtevnost;

        public Opravilo(String naziv, int zahtevnost) {
            this.naziv = naziv;
            this.zahtevnost = zahtevnost;
        }
        public int vrniZahtevnost(){
        return this.zahtevnost;
        }
    }

    //=========================================================================
    public static class Projekt {
        private String naziv;
        private Opravilo[] opravila;

        public Projekt(String naziv, Opravilo[] opravila) {
            this.naziv = naziv;
            this.opravila = opravila;
        }

        public int zahtevnost() {
            int highest=0;
            for (Opravilo x: opravila){
                if (x.vrniZahtevnost()>highest){
                    highest=x.vrniZahtevnost();
                }
            }
            return highest;
        }

        public boolean jePermutacijaOd(Object drugi) {
            int count=0;
            int count2=0;
            if (drugi instanceof Projekt){
                Projekt p = (Projekt) drugi;
            
            if (this.opravila.length>=p.opravila.length){

            for (Opravilo x: this.opravila){
                for(Opravilo y: p.opravila){
                    if (x.equals(y)){
                        count++;
                    }
                }
            }
        }
        else if (this.opravila.length<p.opravila.length){

            for (Opravilo x: p.opravila){
                for(Opravilo y: this.opravila){
                    if (x.equals(y)){
                        count2++;
                    }
                }
            }
        }



            if (count==this.opravila.length || count2==p.opravila.length){
                return true;
            }
        }
            return false;

        }
    }

    //=========================================================================
    public static class Delavec {
        private String ip;
        private int usposobljenost;

        public Delavec(String ip, int usposobljenost) {
            this.ip = ip;
            this.usposobljenost = usposobljenost;
        }
        public int vrniUsposobljenost(){
            return this.usposobljenost;
            }
    }

    //=========================================================================
    public static class Delavnica {
        private Delavec[] delavci;

        public Delavnica(Delavec[] delavci) {
            this.delavci = delavci;
        }

        public int univerzalci(Projekt[] projekti) {
            int count=0;
            for (Delavec d:delavci){
                int sposoben=1;
                for(Projekt p: projekti){
                    if (d.vrniUsposobljenost()<p.zahtevnost()){
                        sposoben=0;
                    }
                }
                if (sposoben==1){
                    count++;
                }
            }
            return count;
        }
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
