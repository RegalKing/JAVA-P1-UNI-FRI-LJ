public class Knjiznica {

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovNaNaslov;
    // n1[] - kok je izposojenih knjig na indexu NASLOV iz knjiznice
    // n2[][] - kok knjig indexa NASLOV ima index CLAN v izposoji
    // n3[] - total kokrat je bla izposojena knjiga na indexu NASLOV (ce clan vrne knjigo ta stevilka ne gre dol medtem ko n1 gre dol)
    private int n1[];
    private int n3[];
    private int n2[][];

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stClanov=stClanov;
        this.stNaslovov=stNaslovov;
        this.stIzvodovNaNaslov=stIzvodovNaNaslov;
        this.n1=new int [stNaslovov];
        this.n3= new int [stNaslovov];
        this.n2=new int [stNaslovov][stClanov];

    }
    public boolean posodi(int clan, int naslov){
        if (this.n1[naslov]<stIzvodovNaNaslov && this.n2[naslov][clan]==0){
            this.n2[naslov][clan]+=1;
            this.n1[naslov]+=1;
            this.n3[naslov]+=1;
            return true;
        }
        else{
            return false;
        }
    }
    public void clanVrne(int clan){
        for (int i=0;i<(this.stNaslovov);i++){
            if (n2[i][clan]>0){
            n1[i]-=1;
            n2[i][clan]=0;
            
        }
    }
    }
    public int posojeni(int naslov){
        return this.n1[naslov];
    }
    public int priClanu(int clan){
        int total=0;
        for (int i=0;i<(this.stNaslovov);i++){
            total+=this.n2[i][clan];
        }
        return total;
    }
    public int najNaslov(){
        int MaxIndex=0;
        int highestNumber=0;
        for (int i=0;i<this.stNaslovov;i++){
            if (this.n3[i]>highestNumber){
                MaxIndex=i;
                highestNumber=this.n3[i];
            }
        }
        return MaxIndex;
    }





}
