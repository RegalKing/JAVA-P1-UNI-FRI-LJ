
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        int start=interval.vrniZacetek();
        int konec=interval.vrniKonec();
        Integer min=null;
        Integer max=null;
        for (int x=start;x<=konec;x++){
            Integer y=this.y(x);
            if (y!=null){
                    if (min==null){
                        min=y;
                    }
                    else{
                        if (y<min){
                            min=y;
                        }
                    }
                    if (max==null){
                        max=y;
                    }
                    else{
                        if (y>max){
                            max=y;
                        }
                    }
                }
        }
        return new Interval(min,max);
        
    }

    public boolean jeMonotono(Interval interval){
        return this.jeMonotono(interval,1) || this.jeMonotono(interval, -1);
    }

    private boolean jeMonotono(Interval interval, int smer) {
        int start=interval.vrniZacetek();
        int konec=interval.vrniKonec();
        Integer previous=null;

        for (int x=start;x<=konec;x++){
            Integer y=this.y(x);
            if (y!=null){
                if (previous != null && y*smer<=previous*smer){
                    return false;
                }
                previous=y;
                }
            }
                
        return true;
        
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota (this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
        if (!this.jeMonotono(interval)){
            return null;
        }
        else{
            return new Inverz(this, interval);
        }




    }
}
