import java.util.*;

            public class NajboljseSeme{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int trenutnoStevilo;
                    long sum=0;
                    long temp;
                    long min=0;
                    long max=0;
                    for (int i=a;i<b;i++){
                        Random rand = new Random(i);
                        for (int j = 1; j <= c; j++) {
                            trenutnoStevilo=rand.nextInt(10);
                            temp=trenutnoStevilo*potenca(10, c-j);
                            sum=sum+temp;
                        }
                        if (sum>max){
                            max=sum;
                            min=i;
                        }
                        sum=0;
                        //System.out.println(min);
                    }
                    System.out.println(min);
                }
                public static long potenca(int a, int b){
                    long potenca=(long)Math.pow(a, b);
                    return potenca;

            }
        }


            