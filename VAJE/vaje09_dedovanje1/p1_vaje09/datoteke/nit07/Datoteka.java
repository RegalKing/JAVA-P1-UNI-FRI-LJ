abstract class Datoteka {

    public abstract int velikost();
    public abstract String ime();
    public abstract String brackets();

    public String toString() {
        return String.format("%s [%s]",this.ime(), this.brackets());
    }
}

        class BesedilnaDatoteka extends Datoteka {
            private String ime;
            private int stZnakov;

            public BesedilnaDatoteka(String ime, int stZnakov) {
                this.ime = ime;
                this.stZnakov = stZnakov;
            }
            @Override
            public String brackets(){
                return String.format("b "+stZnakov);
            }
            @Override
            public String ime(){
                return String.format(this.ime);
            }
            @Override
            public int velikost(){
                return (stZnakov);
            }

        }

        class SlikovnaDatoteka extends Datoteka {
            private String ime;
            private int sirina;
            private int visina;

            public SlikovnaDatoteka(String ime, int sirina, int visina) {
                this.ime = ime;
                this.sirina = sirina;
                this.visina = visina;
            }
            @Override
            public String brackets(){
                return String.format("s "+this.sirina+" x "+this.visina);
            }
            @Override
            public String ime(){
                return String.format(this.ime);
            }
            @Override
            public int velikost(){
                return (3*this.sirina*this.visina+54);
            }
            public int sirina(){
                return this.sirina;
            }
            public int visina(){
                return this.visina;
            }
        
        }

        class Imenik extends Datoteka {
            private String ime;
            private Datoteka[] datoteke;
            private int StVsehDatotek;
            private int SizeVsehDatotek;

            public Imenik(String ime, Datoteka[] datoteke) {
                this.ime = ime;
                this.datoteke = datoteke;
                this.StVsehDatotek=datoteke.length;
                for (int i=0;i<datoteke.length;i++){
                        this.SizeVsehDatotek+=datoteke[i].velikost();
                    }

            }
            @Override
            public String brackets(){
                return String.format("i "+StVsehDatotek);
            }
            @Override
            public String ime(){
                return String.format(this.ime);
            }
            @Override
            public int velikost(){
                return (SizeVsehDatotek+256);
            }
            public int steviloVecjihSlik(int prag){
                int total=0;
                for (int i=0;i<datoteke.length;i++){
                   if (datoteke[i] instanceof SlikovnaDatoteka){
                    SlikovnaDatoteka k=(SlikovnaDatoteka) datoteke[i];
                    if (k.sirina()>=prag && k.visina()>=prag){
                    total+=1;
                    }
                   }
                }
                return total;
            }
            public String poisci(String ime){
                return this.poisci(".",ime);
            }
            private String poisci(String pot, String ime){
                String rezultat=pot;
                for (Datoteka dat: datoteke){
                    if (dat.ime().equals(ime)){ //to pomen da je bla datoteka found
                        rezultat=(pot+"/"+ime);
                        return rezultat;
                    }
                }
                for (Datoteka dat: datoteke){
                    if (dat instanceof Imenik){
                        Imenik imen=(Imenik) dat;
                        rezultat=imen.poisci(pot+"/"+imen.ime(), ime);
                        if (rezultat != null) { //to pomen da je bla datoteka found
                            return (rezultat); 
                    }
                }
            }
            return null; //ce ni datoteke nikjer
        }
    }

            