import java.util.*;

public class Evrosop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter1=0;
        int counter2=0;
        int totalKovanci=0;
        while (sc.hasNext()){
            int kovanec=sc.nextInt();
            if (kovanec==1){
                counter1++;
                totalKovanci++;
            }
            if (kovanec==2){
                counter2++;
                totalKovanci++;
            }
        }
        counter1=counter1-counter2;
        if(counter1<0){
            System.out.println("BANKROT");
        }
        else{
        System.out.println(counter1);
        System.out.println(counter2);
        }
    }
}


        