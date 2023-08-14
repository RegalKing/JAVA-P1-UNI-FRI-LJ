
import java.util.*;

public class Tretja {

    public static abstract class Zival {
        public abstract String oglasiSe();
    }

    public static class Pes extends Zival {
        @Override
        public String oglasiSe(){
            return String.format("hov");
        }


    }

    public static class Macka extends Zival {
        @Override
        public String oglasiSe(){
            return String.format("mijav");
        }
    }

    public static class RodovniskiPes extends Pes {
        private String pasma;
        private RodovniskiPes oce;
        private RodovniskiPes mati;

        public RodovniskiPes(String pasma, RodovniskiPes oce, RodovniskiPes mati) {
            this.pasma = pasma;
            this.oce = oce;
            this.mati = mati;
        }

        public boolean preveri() {
            // if (this.oce==null){ // v navodilu pise da ced je oce null je tudi mati null zato nam ni treba checkirat za mati
            //     return true;
            // }
            // if (this.mati.pasma.equals(this.pasma) && this.oce.pasma.equals(this.pasma) && this.mati.preveri() && this.oce.preveri()) {
            //     return true;
            // }
            // return false;
            return (oce == null || (oce.pasma.equals(pasma) && mati.pasma.equals(pasma) && mati.preveri() && oce.preveri()));

        }
    }
        
    


    public static int prestej(RodovniskiPes[] psi, String pasma) {
        int sum=0;
        for (int i=0;i<psi.length;i++){
            if (psi[i].pasma.equals(pasma)){
                sum+=1;
            }
        }


        return sum;
    }
}
