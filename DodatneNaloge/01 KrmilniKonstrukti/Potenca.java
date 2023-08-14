import java.util.*;

        public class Potenca {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt(); 
                int c = b;
                int sum = 0;
            if (b==0){
                System.out.println("1");
            }
            else{
                while (c>0){
                    if (sum==0){
                        sum=a;
                        c--;
                    }
                    else{
                    sum=sum*a;
                    c--;
                }
            }
            System.out.println(sum);
        }
        }
    }



