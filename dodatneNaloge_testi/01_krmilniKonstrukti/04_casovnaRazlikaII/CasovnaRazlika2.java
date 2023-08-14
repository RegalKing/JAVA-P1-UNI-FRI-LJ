import java.util.*;

public class CasovnaRazlika2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int h1 = sc.nextInt(); // h1 number
            int m1 = sc.nextInt(); // minutes1 number
            int h2 = sc.nextInt(); // h2 number
            int m2 = sc.nextInt(); // minutes2 number
            int hourRazlika=0;
            int minRazlika=0;
            if (h1>h2){
                hourRazlika=h1-h2;
                minRazlika=m1-m2;
                if (minRazlika<0){
                    minRazlika=60-Math.abs(minRazlika);
                    hourRazlika=hourRazlika-1;
                    if (minRazlika<10){
                        System.out.println(hourRazlika+":0"+(minRazlika));
                    }
                    else{
                        System.out.println(hourRazlika+":"+(minRazlika));
                    }
                }
                else{
                    if (minRazlika<10){
                        System.out.println(hourRazlika+":0"+(minRazlika));
                    }
                    else{
                        System.out.println(hourRazlika+":"+(minRazlika));
                    }
                }
            }
        
            else if(h2>h1){
                hourRazlika=h2-h1;                                          
                minRazlika=m2-m1;
                if (minRazlika<0){
                    minRazlika=60-Math.abs(minRazlika);
                    hourRazlika=hourRazlika-1;
                    if (minRazlika<10){
                        System.out.println(hourRazlika+":0"+(minRazlika));
                    }
                    else{
                        System.out.println(hourRazlika+":"+(minRazlika));
                    }
                }
                else{
                    if (minRazlika<10){
                        System.out.println(hourRazlika+":0"+(minRazlika));
                    }
                    else{
                        System.out.println(hourRazlika+":"+(minRazlika));
                    }
            }
        }
            else{
                hourRazlika=0;
                minRazlika=m2-m1;
                if (minRazlika<10){
                    System.out.println(hourRazlika+":0"+(minRazlika));
                }
                else{
                    System.out.println(hourRazlika+":"+(minRazlika));
                }
            }
        }
    }

