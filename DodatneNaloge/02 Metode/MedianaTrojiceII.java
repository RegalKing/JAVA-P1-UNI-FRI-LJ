import java.util.*;

    public class MedianaTrojiceII{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max=max(a,b,c);
            int min=min(a,b,c);
            int mediana=(a+b+c)-max-min;
            System.out.println(mediana);
        }
        public static int min(int a, int b, int c){
            int minimum=Math.min(Math.min(a, b),c);
            return minimum;
        }
        public static int max(int a, int b, int c){
                int maximum=Math.max(Math.max(a, b),c);
                return maximum;
        }
    }