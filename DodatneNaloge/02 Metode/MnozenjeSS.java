import java.util.*;

    public class MnozenjeSS{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            // rezultat=zmnoziZsestevanjem(a,b)
            // System.out.println(rezultat);
            System.out.println(zmnoziZsestevanjem(a,b));
        }
        public static int zmnoziZsestevanjem(int prvoStevilo, int drugoStevilo){
            int cummulative=0;
            for (int i=0;i<drugoStevilo;i++){
                cummulative+=prvoStevilo;
            }
            return cummulative;
                
        }
    }
