import java.util.*;
    public class PredvolilniGolaz{
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int budget = sc.nextInt();
            //System.out.println(budget);
            while (sc.hasNextLine()){
                int mealPrice = sc.nextInt();
                int steviloLacnih = sc.nextInt();
                int WineEnjoyers = sc.nextInt();
                budget=budget-zracunajCeno(mealPrice,steviloLacnih,WineEnjoyers);
                if (budget<0){
                    System.out.printf(" -");
                    sc.close();
                    break;
                }
                else if(budget==0){
                    System.out.printf(" 0");
                    sc.close();
                    break;
                }
                System.out.printf(" %d",budget);
                System.out.println();
            }
        }
        public static int zracunajCeno(int cena, int stevilo, int vino){
            int CenaObroka=cena*stevilo;
            if (vino==1){
                CenaObroka*=1.5;
                if (CenaObroka%1.5!=0){
                    CenaObroka+=1;
                }

            }
            System.out.printf("%d",CenaObroka);
            return CenaObroka;
            

    }
}


            