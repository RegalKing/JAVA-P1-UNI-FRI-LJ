import java.util.*;

            public class PotencaPoModulu {
            public static void main (String[] args){ // druga resitev -> lahko bi tole psevdokodo iz wikipedijo pretvoru: https://en.wikipedia.org/wiki/Exponentiation_by_squaring
                                                        // prva resitev -> rewriti z BigInteger -> import java.math.BigInteger;
                                                        // tretja resitev -> ?

                    Scanner sc = new Scanner(System.in);
                    long a = sc.nextLong();
                    long b = sc.nextLong();
                    long m = sc.nextLong();
                    long result=polModula(a,b,m); 
                    System.out.println(result);       
            }
            public static long polModula(long a,long e,long m){
                double ex=(double)e/2;
                //System.out.println(ex);
                long PolModula=0;
                for (double i=0;i<=e;i++){
                    if (PolModula==0){
                        PolModula=a;
                        break;
                    }
                    else{
                        PolModula*=a;
                    }
                }
                return (((PolModula%m)*(PolModula%m))%m);
            }



            
        }
    
        