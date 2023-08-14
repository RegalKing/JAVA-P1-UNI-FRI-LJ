public class Fibonacci {
    private int current1;
    private int current2;
    

    public Fibonacci(int a, int b){
        this.current1=a;
        this.current2=b;
    }
    public int naslednji(){
        
        int total=this.current1+this.current2;
        this.current1=current2;
        this.current2=total;
        return total;

    }
}
