public class Oseba{

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,Oseba oce, Oseba mati){
        this.ime=ime;
        this.priimek=priimek;
        this.spol=spol;
        this.letoRojstva=letoRojstva;
        this.oce=oce;
        this.mati=mati;
    }
    public String vrniIme(){
        return this.ime;
    }
    public String toString(){

        return(this.ime+" "+this.priimek+" ("+this.spol+"), "+this.letoRojstva);
    }
    public int starost(int leto){
        int age=leto-this.letoRojstva;
        return age;
    }
    public boolean jeStarejsaOd(Oseba os){
        int age=this.letoRojstva-os.letoRojstva;
        if (age<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static Oseba starejsa(Oseba a, Oseba b){
        if (a.letoRojstva<b.letoRojstva){
        return a;
        }
        else if (b.letoRojstva<a.letoRojstva){
            return b;
        }
        else{
            return null;
        }
    }
    public String imeOceta(){
        if (this.oce==null){
            return null;
        }
        else{
            return this.oce.ime;
        }
    }
    public boolean jeBratAliSestraOd(Oseba os){
        if (this.oce==os.oce && this.mati==os.mati && this!=os){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean jeSestraOd(Oseba os){
        if (this.oce==os.oce && this.mati==os.mati && this.spol=='Z' && this!=os){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean jeTetaOd(Oseba os){
        if ((this.oce.priimek == os.oce.priimek || this.mati.priimek == os.mati.priimek) && this!=os){
            return true;
        }
        else{
            return false;
        }
     }
     public boolean jeOcetovskiPrednikOd(Oseba os){
        if (this.letoRojstva<os.letoRojstva && os.oce!=this && this.spol=='M' && os.oce!=null && (this.priimek==os.oce.priimek || this.priimek==os.mati.priimek)){
            return true;
        }
        else{
            return false;
        }
    }








}
