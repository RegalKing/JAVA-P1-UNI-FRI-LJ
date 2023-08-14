
/*
 * tj.exe
 */

public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        // popravite / dopolnite ...
        public int casCiscenja() {
            return -1;
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }
        @Override
        public int casCiscenja(){
            return this.vrniSteviloMest()*2;
    }

    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }
        @Override
        public int casCiscenja(){
            return this.vrniSteviloRacunalnikov()*3+this.vrniSteviloMest()*2;
    }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }
        @Override
        public int casCiscenja(){
            return this.povrsina+this.vrniSteviloMest()*2;
    }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) {
            int razporeditev[]=new int[predavalnice.length];
            int zapolnjena[]=new int[predavalnice.length];
            int current=stStudentov;
            if (stStudentov!=0){
                for (int i=0;i<predavalnice.length;i++){
                    if (predavalnice[i] instanceof Avditorna && razporeditev[i]==0){
                        int space=predavalnice[i].vrniSteviloMest();
                        if (current>=space){ 
                            razporeditev[i]=space;
                            current-=space;
                            ostanek[0]=current;
                        }
                        else if (current!=0){
                            razporeditev[i]=current;
                            current-=current;
                            ostanek[0]=current;
                        }
                    }
                }
                for (int i=0;i<predavalnice.length;i++){
                    if (predavalnice[i] instanceof Racunalnica && razporeditev[i]==0){
                        int space=predavalnice[i].vrniSteviloMest();
                        if (current>=space){ 
                            razporeditev[i]=space;
                            current-=space;
                            ostanek[0]=current;
                        }
                        else if (current!=0){
                            razporeditev[i]=current;
                            current-=current;
                            ostanek[0]=current;
                        }
                    }
                }
                for (int i=0;i<predavalnice.length;i++){
                    if (predavalnice[i] instanceof Garaza && razporeditev[i]==0){
                        int space=predavalnice[i].vrniSteviloMest();
                        if (current>=space){ 
                            razporeditev[i]=space;
                            current-=space;
                            ostanek[0]=current;
                            
                        }
                        else if (current!=0){
                            razporeditev[i]=current;
                            current-=current;
                            ostanek[0]=current;
                        }
                    }
                }
            }
            if (stStudentov==0){
                ostanek[0]=0;
            }
            return razporeditev;

                






        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
