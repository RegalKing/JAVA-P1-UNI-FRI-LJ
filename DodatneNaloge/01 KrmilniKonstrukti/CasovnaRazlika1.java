import java.util.*;

public class CasovnaRazlika1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int h1 = sc.nextInt(); // h1 number
            int m1 = sc.nextInt(); // minutes1 number
            int h2 = sc.nextInt(); // h2 number
            int m2 = sc.nextInt(); // minutes2 number
            int hourRazlika=0;
            int minRazlika=0;
            int Rezultat=0;
            if (h1>h2){
                hourRazlika=(h1-h2)*60;
                minRazlika=m1-m2;
                Rezultat=hourRazlika+minRazlika;
                System.out.println(Rezultat);
            }
            else if (h2>h1){
                hourRazlika=(h2-h1)*60;
                minRazlika=m2-m1;
                Rezultat=hourRazlika+minRazlika;
                System.out.println(Rezultat);
            }
            else{
                hourRazlika=(h2-h1)*60;// to je enako 0 ker je else primer za h2==h1
                minRazlika=m2-m1;
                System.out.println(minRazlika);
            }
    }
}
                