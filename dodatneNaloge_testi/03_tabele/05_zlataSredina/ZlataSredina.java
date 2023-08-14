import java.util.*;
        public class ZlataSredina{
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int k = sc.nextInt();
                int dolzina=2*k+1;
                int[] tabela=new int[dolzina];
                for (int i=0;i<dolzina;i++){
                    tabela[i]=sc.nextInt();
                }
                //System.out.println(Arrays.toString(tabela));
                Arrays.sort(tabela);
                //System.out.println(Arrays.toString(tabela));
                System.out.println(tabela[k]);
            }
        }
