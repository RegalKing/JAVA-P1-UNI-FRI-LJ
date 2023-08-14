public class Vsota extends Zaporedje {

    private Zaporedje first;
    private Zaporedje second;

    public Vsota(Zaporedje first, Zaporedje second){
        this.first=first;
        this.second=second;
    }

    @Override
    public Integer y(int x) {
        if (this.first.y(x)==null || this.second.y(x)==null){
            return null;
        }
        return this.first.y(x)+this.second.y(x);
    }
}