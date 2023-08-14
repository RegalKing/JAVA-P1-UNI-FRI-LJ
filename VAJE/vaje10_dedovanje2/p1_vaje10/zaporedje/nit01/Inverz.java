
public class Inverz extends Zaporedje {

    private Zaporedje start;

    private Interval interval;

    public Inverz(Zaporedje start, Interval interval) {
        this.start=start;
        this.interval=interval;
    }

    @Override
    public Integer y(int x) {
        int beginning=this.interval.vrniZacetek();
        int end=this.interval.vrniKonec();
        for (int i=beginning;i<=end;i++) {
            Integer y=this.start.y(i);
            if (y!=null&&y==x) { 
                return i;
            }
        }
        return null;
    }
}
