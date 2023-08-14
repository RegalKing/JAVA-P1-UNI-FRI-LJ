import java.util.*;

            public class PotencaPoModuluSpet4narobe {
            public static void main (String[] args){    // druga resitev -> lahko bi tole psevdokodo iz wikipedijo pretvoru: https://en.wikipedia.org/wiki/Exponentiation_by_squaring
                                                        // prva resitev -> rewriti z BigInteger -> import java.math.BigInteger;
                                                        // tretja (zahtevana) resitev -> v namigih pri nalogi napisano

                    Scanner sc = new Scanner(System.in);
                    long a = sc.nextLong();
                    long b = sc.nextLong();
                    long m = sc.nextLong();
                    long result=polModula(a,b,m); 
                    System.out.println(result);       
            }
            public static long polModula(long a,long e,long m){
                double ex=(double)e/2;
                //System.out.println(((Math.pow(a, ex))%m)*((Math.pow(a, ex))*m));
                //System.out.println(Math.pow(a, ex));
                //System.out.println(Math.pow(a, ex)%m);
                //System.out.println((Math.pow(a, ex)%m)*(Math.pow(a, ex)%m));
                //System.out.println((((Math.pow(a, ex))%m)*((Math.pow(a, ex))%m))%m);
                return (long)((((Math.pow(a, ex))%m)*((Math.pow(a, ex))%m))%m);
            }



            
        }
    
        