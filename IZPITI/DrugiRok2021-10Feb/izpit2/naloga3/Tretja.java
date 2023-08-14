
/*
 * tj.exe
 */

/*
 * Razli"cni objekti tipa Oseba, Cilj oz. Nocitev predstavljajo razli"cne
 * osebe, cilje oz. no"citve.
 *
 * Distinct objects of classes Oseba, Cilj, and Nocitev represent distinct
 * persons, destinations, and overnight stays.
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Oseba {
        private String ip;
        private String drzava;

        public Oseba(String ip, String drzava) {
            this.ip = ip;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Cilj {
        private String kraj;
        private String drzava;

        public Cilj(String kraj, String drzava) {
            this.kraj = kraj;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Nocitev {
        private Oseba oseba;
        private Cilj cilj;
        private int leto;

        public Nocitev(Oseba oseba, Cilj cilj, int leto) {
            this.oseba = oseba;
            this.cilj = cilj;
            this.leto = leto;
        }
    }

    //=========================================================================
    public static int notranje(Nocitev[] nocitve) {
        int counter=0;
        for (int i=0;i<nocitve.length;i++){
            if (nocitve[i].oseba.drzava==nocitve[i].cilj.drzava){
                counter++;
            }
        }
        return counter;
    }

    //=========================================================================
    public static boolean jeZvesta(Nocitev[] nocitve, Oseba oseba) {

        Cilj destination=null;

        for (Nocitev night: nocitve){
            if (!(night.oseba.equals(oseba))){
                continue;
            }
            if (destination==null){
                destination=night.cilj; // zabelezi prvi cilj osebe ce cilj se ne bil zabelezen
            }
            else{
                if (!(night.cilj.equals(destination))){
                    return false; // vrne false in konca metodo ce najde da je oseba potovala na 2 razlicna cilja
                }
            }
        }
        return true; //vrne true ce ne najde da bi oseba potovala na 2 razlicnih lokacijah (ciljih)

    }

    //=========================================================================
    public static int[][] obiskanost(Nocitev[] nocitve, Cilj[] cilji, // ne da se mi tega dokoncat k ne razumm cist kva hocjo navodila
                                     int minLeto, int maxLeto) {

        return null;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
